package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Primary residence", "March 1st, 2020", 950000, "123 pepe lane", 1, 17000, 50000));
        assets.add(new House("Beach house", "April 1st, 2000", 500000, "45 coconuts court", 2, 2050, 5520));

        assets.add(new Vehicle("Wheels", "January 21st, 2021", 14000, "Not Miata", 3, 45000));
        assets.add(new Vehicle("Scoot", "August 5th, 2023", 5000, "Yamaha", 1, 2000));


        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired());
            System.out.println(asset.getOriginalCost());
            System.out.println(asset.getValue());

            if (asset instanceof House) {
                System.out.println("Address: " + ((House) asset).getAddress());
            }
            if (asset instanceof Vehicle) {
                System.out.println("Vehicle Make: " + ((Vehicle) asset).getMake());
            }
        }
    }
}