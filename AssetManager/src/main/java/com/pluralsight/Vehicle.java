package com.pluralsight;

public class Vehicle extends Asset {
    private String make;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String make, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.make = make;
        setYear(year);
        setOdometer(odometer);
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative");
        }
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        if (odometer < 0) {
            throw new IllegalArgumentException("Odometer cannot be negative");
        }
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        switch (year) {
            case 0, 1, 2, 3:
                value -= (0.03 * value) * year;
                break;
            case 4, 5, 6:
                value -= (0.06 * value) * year;
                break;
            case 7, 8, 9, 10:
                value -= (0.08 * value) * year;
            default:
                value -= 1000.00;
        }

        if (odometer > 100000.00 && !make.equalsIgnoreCase("honda") && !make.equalsIgnoreCase("toyota")) {
            value -= (0.25 * value);
        }

        return value;
    }
}
