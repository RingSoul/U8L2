import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        /* testing the method hasDuplicatesInColumn */
        int[][] test1 = {{1, 2, 3, 4},
                         {2, 3, 4, 5},
                         {3, 4, 5, 6}};
        // steps: print array -> print expected result -> print actual output
        System.out.println("2D array:");
        for (int[] row : test1)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: false");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test1));

        System.out.println("--------------------------------");

        int[][] test2 = {{1, 1, 2, 3},
                         {2, 2, 3, 2},
                         {3, 3, 4, 1}};
        System.out.println("2D array:");
        for (int[] row : test2)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: false");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test2));

        System.out.println("--------------------------------");

        int[][] test3 = {{1, 2, 3, 4, 5},
                         {1, 0, 2, 5, 4}};
        System.out.println("2D array:");
        for (int[] row : test3)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test3));

        System.out.println("--------------------------------");

        int[][] test4 = {{1, 2, 0, 4},
                         {3, 5, 6, 7},
                         {1, 8, 9, 10}};
        System.out.println("2D array:");
        for (int[] row : test4)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test4));

        System.out.println("--------------------------------");

        int[][] test5 = {{1, 2, 3, 4, 5},
                         {0, 6, 7, 8, 9},
                         {10, 11, 12, 13, 15},
                         {0, 16, 17, 18, 19}};
        System.out.println("2D array:");
        for (int[] row : test5)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test5));

        System.out.println("--------------------------------");

        int[][] test6 = {{0, 1, 2, 3},
                         {4, 5, 6, 7},
                         {8, 9, 10, 11},
                         {12, 13, 2, 14}};
        System.out.println("2D array:");
        for (int[] row : test6)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test6));

        System.out.println("");

        int[][] test7 = {{0, 1, 2, 3},
                         {4, 5, 6, 7},
                         {8, 9, 10, 11},
                         {12, 13, 14, 11}};
        System.out.println("2D array:");
        for (int[] row : test7)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + hasDuplicatesInColumn(test7));
    }

    // return true if one int literal appears more than once in a column, false if no duplicate
    public static boolean hasDuplicatesInColumn(int[][] nums)
    {
        for (int c = 0; c < nums[0].length; c++)
        {
            for (int r = 0; r < nums.length; r++)
            {
                int current = nums[r][c];
                for (int i = r + 1; i < nums.length; i++)
                {
                    if (current == nums[i][c])
                    {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
