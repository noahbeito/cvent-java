package com.pluralsight;

public class Card {
    private final CardSuit suit;
    private final String value;
    private boolean isFaceUp;

    public Card(CardSuit suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getPointValue() {
        if (isFaceUp) {
            switch (value) {
                case "A": return 11;
                case "K", "Q", "J", "10": return 10;
                case "9", "8", "7", "6", "5", "4", "3", "2": return Integer.parseInt(value);
            }
        }
        return 0;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
