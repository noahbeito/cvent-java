package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Deck deck = new Deck();
//        Hand hand1 = new Hand();
//        // deal 5 cards
//        for(int i = 0; i < 5; i++) {
//            // get a card from the deck
//            Card card = deck.deal();
//            // deal that card to the hand
//            hand1.deal(card);
//        }
//        int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many players?: ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        List<String> players = new ArrayList<>();
        List<Hand> hands = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Name of Player " + i + ": ");
            players.add(scanner.nextLine());
            hands.add(new Hand());
        }


        for (Hand hand: hands) {
            Card card = deck.deal();
            hand.deal(card);
        }






    }


}