public class TwoDimensionalArrays {

    public static void main(String [] args) {

        //2d array is an array made up of subarrays
        int [][] numbers = { {1, 2, 3, 4},
                            {5, 6, 7, 8} ,
                            {9, 10, 11, 12} };

        //to reference one value in a 2d array, you need two indices
        //one index for which row, one index for which column

        //the value 7 is at row 1, column 2
        System.out.println("value at row 1 col 2 is " + numbers[1][2]);


        //12
        System.out.println("value at row 2 col 3 is " + numbers[2][3]);

        //a 2d array's length is the number of subarrays (rows)
        System.out.println(numbers.length);

        //to get number of columns:
        //how many values are in the 0th subarray, same as how many cols
        System.out.println(numbers[0].length);

        //2d arrays can technically have different row lengths (ragged arrays)
        //-not tested in this class or on AP

        //-assume any 2d arrays seen this year are rectangular (same row length)

        //print the 9, 10, 11, 12 from the last row
        //row index stays the same, column index changes
        System.out.print(numbers[2][0] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][2] + " ");
        System.out.print(numbers[2][3] + " ");
        System.out.println();

        //iterate i through how many values are in the row (how many columns)
        for (int i = 0; i < numbers[0].length; i++) {
            System.out.print(numbers[2][i] + " ");
        }
        System.out.println();
        System.out.println();

        //print the whole 2d array as a grid
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //total quantity of values in the 2d array: number of rows * number of cols:
        System.out.println("total values: " + numbers.length * numbers[0].length);

        //the 2d array is an array of int arrays
        for (int [] row: numbers) {
            //treat each row like a regular 1D array
            for (int n: row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        //print the numbers in column 1: 2, 6, 10

        //loop through how many items are in each col, same as how many rows
        for (int i = 0; i < numbers.length; i++) {
            //col index is constant, row index is changing
            System.out.println(numbers[i][1]);
        }

        String [] names = {"bill", "john", "jeff"};
        String [] subjects = {"animals", "science", "math", "pe"};

        //2d int array where the cols represent each student
        //and rows represent each class

        //4 rows, 3 cols
        int [][] grades = new int[4][3];

        //animals class grades
        grades[0][0] = 60;
        grades[0][1] = 20;
        grades[0][2] = 5;

        //science grades
        grades[1][0] = 63;
        grades[1][1] = 65;
        grades[1][2] = 67;

        //math
        grades[2][0] = 62;
        grades[2][1] = 98;
        grades[2][2] = 97;

        //pe
        grades[3][0] = 68;
        grades[3][1] = 100;
        grades[3][2] = 14;

        //calculate and print each student's average grade across
        //all their classes (col averages)
        System.out.println("student avgs:");
        double avg;
        //loop through cols (each name) first on outside
        for (int j = 0; j < names.length; j++) {
            //loop through rows (classes) on inside
            avg = 0;

            for (int i = 0; i < subjects.length; i++) {
                avg += grades[i][j];
            }
            avg = avg/subjects.length;
            System.out.println(names[j] +"'s avg: " + avg);

        }

        //calculate and print each class's average grade (row avgs)

        //calculate and print the overall average grade (overall avg)

    }

}
