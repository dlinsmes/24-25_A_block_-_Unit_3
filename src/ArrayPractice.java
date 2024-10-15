public class ArrayPractice {
    public static void main(String [] args) {
        //create an array that holds 5 names
        //-assign values
        String [] names  = new String [5];
        names[0] = "john";
        names[1] = "uhhhhh mike";
        names[2] = "daniel";
        names[3] = "jiamu";
        names[4] = "ryan";

        //index 5 is out of bounds for length 5 bc indexing
        //starts at 0
//        names[5] = "lauren";

        //use a loop to print by iterating throuch each index
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //memory location
        System.out.println(names);

        System.out.println();

        //for-each loop aka enhanced for loop
        //will go through all values in the array in order
        for(String n: names) {
            //n is a String variable that temporarily
            //cycles through each value in the array
            //n is not meant to be an index
            System.out.println(n);
        }

        System.out.println();

        for (String n: names) {
            //for each loops cannot be used to change
            //values in arrays
            n = "sunny";
        }

        //data type of the for-each loop variable should
        //match the data type of the array
        for (String n: names) {
            System.out.println(n);
        }

        //regular for loops CAN change array values
        for (int i = 0; i < names.length; i++) {
            names[i] = "sunny";
        }

        for (String n: names) {
            System.out.println(n);
        }

        int [] nums = {3, 5, 3, 3, 4, 8, 2, 0, 3, 7};

        //for-each loop to print each value in nums
        for (int n: nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // do NOT try to use n as an index
//        for (int n: nums) {
//            System.out.print(nums[n] + " ");
//        }
//        System.out.println();

        //use a loop to count how many 3s are in nums
        //regular for loop
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3) {
                count = count + 1;
            }
        }
        System.out.println(count + " 3s in nums");

        //for each loop
        count = 0;
        for (int n: nums) {
            if(n == 3) {
                count++;
            }
        }
        System.out.println(count + " 3s in nums");

        int a = 7;
        int b = 9;

        int temp = a;
        a = b;
        b = temp;

        //swap the first and last elements in the nums array
        temp = nums[0];
        nums[0] = nums[ nums.length-1 ]; //last index
        nums[ nums.length - 1 ] = temp;

        for (int n: nums) {
            System.out.print(n + " ");
        }
        System.out.println();



        //selection sort: moving from left to right, build
        //the sorted section on the left by finding the smallest
        //value in the unsorted section and swapping it into
        //position

        //use index i as the current position of the sorted
        //section that we're building
        for (int i = 0; i < nums.length; i++) {

            //track the index of the next smallest value in
            //the unsorted section
            int nextSmallestIndex = i;

            //find the index of the smallest value in the unsorted
            //section
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[nextSmallestIndex]) {
                    nextSmallestIndex = j;
                }
            }

            //swap the values at i and nextSmallestIndex
            int t = nums[i];
            nums[i] = nums[nextSmallestIndex];
            nums[nextSmallestIndex] = t;


            //see the progress of the sort algorithm
            for (int n: nums) {
                System.out.print(n + " ");
            }
            System.out.println();


        }

    }
}
