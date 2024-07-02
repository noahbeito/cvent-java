package com.tuesday;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jim Slim", 4, "jimmy@slimmy.com");

        System.out.println(person.getName());

        try {
            person.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person.getName());

        try {
            person.setName("Jimmy Slimmy");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person.getName());

        try {
            person.setAge(-4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            person.setEmail("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            person.setEmail("jimmyslimmy.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person.getEmail());

    }
}