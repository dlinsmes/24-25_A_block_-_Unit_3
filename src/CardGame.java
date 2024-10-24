import java.util.Scanner;

public class CardGame {

    public static void main(String [] args) {
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //randomly generate a rank and suit combo to create a card
        int sIndex = (int)(Math.random() * suits.length); //[0, 3]
        int rIndex = (int)(Math.random() * ranks.length); //[0, 12]

        System.out.println("you drew the " + ranks[rIndex] + " of " + suits[sIndex]);

        //print every rank and suit combination
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {

                System.out.println(ranks[j] + " of " + suits[i]);
            }
        }

        System.out.println();

        //do the same using for-each loops
        //variable type matches the array type
        //the variable will temporarily hold the direct value - don't use index
        for(String suit: suits) {
            for(String rank: ranks) {
                System.out.println(rank + " of " + suit);
            }
        }

        int [] deck = new int [52];

        //assign values 0, 1, 2, ...., 50, 51
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        System.out.println();

        //0 - Ace of Hearts
        //1 - 2 of Hearts
        //12 - King of Hearts
        //13 - Ace of Diamonds
        //26 - Ace of Clubs
        //39 - Ace of Spades
        //51 - King of Spades
        for (int i = 0; i < 52; i++) {

            //13 different values: [0, 12] - use modulo
            int rankI = i % 13;

            //4 different values: [0, 3] - use int div
            int suitI = i / 13;
            System.out.println(ranks[rankI] + " of " + suits[suitI]);

        }

        //shuffle the deck array - use random numbers
        //swap to a random index
        for (int i = 0; i < 52; i++) {

            int swapIndex = (int)(Math.random() * 52);

            //swap what's at position i and what's at position swapIndex

            int temp = deck[i];
            deck[i] = deck[swapIndex];
            deck[swapIndex] = temp;

        }

        System.out.println();

        for (int i = 0; i < 52; i++) {
            int value = deck[i];

            //use value, not i, bc i is the sequential position
            //and value is what's stored in the array
            int rankI = value % 13;
            int suitI = value / 13;

            System.out.println("Card " + value + ": " + ranks[rankI] + " of " + suits[suitI]);

        }

        int [] hand = new int [7];

        //use a variable to track the current index in the deck considered to be the "top"
        int top = 0;

        System.out.println();


        System.out.println("your hand:");

        //draw a card to fill the hand
        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck[top];

            //increment top each time a card is drawn so that the next top card is
            //something different from the deck
            top = top + 1;

            int rankI = hand[i] % 13;
            int suitI = hand[i] / 13;
            System.out.println("Card " + i + " in hand: " + ranks[rankI] + " of " + suits[suitI]);

        }

        //game: user exchanges cards in their hand for new ones drawn from the deck
        //until they have four of a kind of the same rank in their hand
        //-user enters the index of the card in their hand they want to draw a new card for

        //while loop that runs until hand has four of a kind
        //-ask user which index in the hand they want a new card for
        //-replace that card with a new card drawn from the deck
        //-print the new hand of cards
        //-determine whether they have 4 of a kind
        Scanner s = new Scanner(System.in);

        boolean fourOfKind = false;

        while (!fourOfKind) {
            //step 1
            System.out.println("Which card do you want to replace?");
            int index = s.nextInt();

            //step 2
            hand[index] = deck[top];
            //move where the "top" of the deck is
            top = top + 1;

            //step 3
            for (int i = 0; i < hand.length; i++) {
                //determine the rank and suit for each card value
                int rankI = hand[i] % 13;
                int suitI = hand[i] / 13;
                System.out.println("Card " + i + " in hand: " + ranks[rankI] + " of " + suits[suitI]);
            }

            //step 4
            for (int i = 0; i < hand.length; i++) {

                //look at rank to determine 4 of kind
                int rankI = hand[i] % 13;

                int count = 0;

                for(int j = i; j < hand.length; j++) {
                    //determine rank of card j
                    int rankJ = hand[j] % 13;

                    //increment count if the ranks are the same
                    if(rankI == rankJ) {
                        count++;
                    }
                }

                //when there are four of a kind, change the boolean variable to end the while loop
                if (count == 4) {
                    fourOfKind = true;
                    System.out.println("you have four " + ranks[rankI] + "s");
                }

            }

        }

    }


}
