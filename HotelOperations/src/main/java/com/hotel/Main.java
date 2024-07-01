package com.hotel;

public class Main {
    public static void main(String[] args) {
        Reservation newRes = new Reservation("King", 139.00, 3, true);
        System.out.println(newRes.getReservationTotal());
    }
}
