package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @author Paul Bonenfant May 2020
 * modifier nandita
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public Card(int value, String suit) {
         this.suit = suit;
        this.value = value;
}

    public Card() {
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", value=" + value + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Card)) return false;
        Card otherCard = (Card) other;
        return this.value == otherCard.value && this.suit == otherCard.suit;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public void printInfo() {
    }  
}
