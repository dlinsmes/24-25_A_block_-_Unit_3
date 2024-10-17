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
        //-use enters the index of the card in their hand they want to draw a new card for

    }


}
