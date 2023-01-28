package exercise1;
import java.util.*;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 modifier nandita
 fetch + merge branch code
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            int a = (int) (Math.random() * 13) + 1;
            card.setValue(a);
            int b = (int) (Math.random() * 4);
            card.setSuit(card.SUITS[b]);
            System.out.println(a);
            System.out.println(b);
            hand[i] = card;
        }
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card value: (1-13)");
        int value = sc.nextInt();
        if(value == 11) value = 11;
        else if(value == 12) value = 12;
        else if(value == 13) value = 13;

        System.out.println("Enter card suit: (1-4)");
        String suit = sc.next();
        if(suit.equals("1")) suit = Card.SUITS[0];
        else if(suit.equals("2")) suit = Card.SUITS[1];
        else if(suit.equals("3")) suit = Card.SUITS[2];
        else if(suit.equals("4")) suit = Card.SUITS[3];

        Card userCard = new Card(value,suit);

        Card foundCard = null;
for (int i = 0; i < hand.length; i++) {
    if (hand[i].equals(userCard)) {
        foundCard = hand[i];
        break;
    }
}

if (foundCard != null) {
    printInfo();
} else {
    System.out.println("Card not found in hand.");
}
}

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        
    //"I'm done!"
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Nandita Badhwar, but you can call me Nandita");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get a good job in IT field");
        System.out.println("-- Be successful and make my family proud");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Make out some time for myself");
        System.out.println("-- Meditation");
        System.out.println("-- Do some fun with my family");
        System.out.println("-- watching web series if I could make out some time");

        System.out.println();
        
    
    }

}
