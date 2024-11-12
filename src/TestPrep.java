public class TestPrep {
    public static void main(String [] args) {

        int [] nums;
        nums = new int [ (int)(Math.random() * 5 + 4) ];

        //set first and last values in nums to 4
        nums[0] = 4;
        nums[ nums.length-1 ] = 4;
        //set all other values to 2

        for(int i = 1; i < nums.length-1; i++) {
            nums[i] = 2;
        }

        //print the array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //for-each
        //data type matches the array type
        //the variable iterates through each VALUE, not index
        for(int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //print the values in nums with even-numbered indices
        for (int i = 0; i < nums.length; i+=2) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //you can't do this with a for-each loop bc
        //for-each loops run through all values in sequence
        //and don't use indexing

        //for-each loops cannot be used to change values
        //in arrays
        for (int num: nums) {
            num = 0;
        }

        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //selection sort - swap the next smallest value
        //on the unsorted right side with the current
        //left side position

        //shuffle an array - need at least one random index to swap with
        //to swap, you need a temp variable

        //4 rows, 7 cols
        int [][] nums2d = new int[4][7];

        //length of a 2d array is number of rows
        //same as how many subarrays
        System.out.println(nums2d.length);

        //to get number of cols, get the length of any
        //valid row/subarray
        System.out.println(nums2d[0].length);

        //set the corner values to 3
        nums2d[0][0] = 3;
        nums2d[0][ nums2d[0].length-1 ] = 3;
        nums2d[3][0] = 3;
        nums2d[ nums2d.length - 1 ][ nums2d[0].length-1 ] = 3;

        for(int i = 0; i < nums2d.length; i++) {
            for (int j = 0; j<nums2d[0].length; j++) {
                System.out.print(nums2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //for-each loops to print 2d
        //outer loop iterates through each subarray (row)
        for (int [] row: nums2d) {
            //inner loop iterates through each value within the row
            for(int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();


        //can mix regular for loops and for-each loops
        for(int i = 0; i < nums2d.length; i++) {
            for(int num: nums2d[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int [] row: nums2d) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }

        //set each column's values to a different random number
        // 5 7 4 2
        // 5 7 4 2
        // 5 7 4 2

        //iterate through cols on the outside so that you can
        //assign the same number within a col
        for(int col = 0; col < nums2d[0].length; col++) {
            int r = (int)(Math.random() * 5 + 3);
            for (int row = 0; row < nums2d.length; row++) {
                nums2d[row][col] = r;
            }
        }
        System.out.println();

        for (int i = 0; i < nums2d.length; i++) {
            for (int j = 0; j < nums2d[0].length; j++) {
                System.out.print(nums2d[i][j] + " ");
            }
            System.out.println();
        }

        //starts at the indicated index and goes until the end
        System.out.println("apple".substring(3));

        //inclusive, exclusive
        System.out.println("apple".substring(0, 4));
    }
}
