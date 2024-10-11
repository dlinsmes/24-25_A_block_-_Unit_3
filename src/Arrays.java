import java.util.Scanner;
public class Arrays {

    public static void main(String [] args) {

        String word = "sun";

        //a string's length is the number of chars
        System.out.println(word.length());

        //provides the part of the string beginning at the provided index
        //indexing (positioning) starts at 0
        System.out.println(word.substring(1));

        //substring with two indices gives the part of the string
        // [startingIndex, endingIndex)
        System.out.println(word.substring(0, 2));

        //arrays hold multiple values under a single variable name
        //each value is referenced with an index (position)
        //indexing starts at 0

        //declare an array that holds Strings called words
        //and initializes it to hold 4 values
        //-different from lists, array lengths are predefined
        //and can't change
        String [] words = new String [4];

        //to assign a value into an array, use an index number
//        words[0] = "apple";
        words[1] = "bazinga";
        words[2] = "word";
        words[3] = "mike";

        //when the length is 4, the last possible index is 3
        //in general, the last index is the length - 1

        //out of bounds bc the index is invalid
        //words[4] = "invalid";

        //each value in the array can be referred to as an element
        //each position is an index

        System.out.println("element at index 1 is " + words[1]);

        //if an array value isn't assigned, it defaults to null (nothing)
        //(null is not a string)
        System.out.println("element at index 0 is " + words[0]);

        //for an int, defaults to 0, for double 0.0, for boolean false;

        int [] numbers = new int[3];
        System.out.println(numbers[2]);

        String w;
        //the default values only get used in arrays, not for
        //single-value variables
//        System.out.println(w);

        //print everything in the words array
        System.out.println(words);
        //this outputs the memory location (not useful)

        System.out.println();

        //to print each value, you need to access each element using a
        //loop and iterate through all the indices
        for(int i = 0; i< words.length; i++) {
            //starting index is 0, last valid index is length-1
            System.out.println("index " + i + " is " + words[i]);
        }

        //if you know the initial values in the array, can set it up
        //like this:
        double [] moreNums = {56.9, 23.0, -123213, 9, 0.22222};
        System.out.println("element at index 3 is " + moreNums[3]);

        //use an array to solve the million die roll problem:
        //-each value in the array can hold the count of one roll result
        //-use an int array bc the quantity of rolls is counted with
        //whole numbers

        //set length to 6 - one value for each roll
        int [] rolls = new int [6];
        //all values will default to 0

        //indices will be 0-5

        for (int i = 0; i < 1000000; i++) {
            int random = (int)(Math.random() * 6 + 1);

            //to address the indexing being 0-5 and random being 1-6,
            //can subtract one from random to use as an index
            int index = random - 1;
            rolls[index] = rolls[index] + 1;

        }

        //print out each roll result in a nicely formatted output
        for (int i = 0; i < rolls.length; i++) {

            //use i+1 to change the 0-5 indices to a 1-6 roll number
            System.out.println("number of " + (i+1) + "s: " + rolls[i] );
        }




    }

}
