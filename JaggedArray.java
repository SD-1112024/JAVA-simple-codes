package JAVAPROGRAMMING;

public class JaggedArray 
     {
    public static void main(String[] args) {
        // Declare a 2D array (jagged array)
        int[][] jaggedArray = new int[3][];// creating a jagged array

        // Initialize each row with different sizes
        jaggedArray[0] = new int[3]; // Row 0 has 3 elements
        jaggedArray[1] = new int[2]; // Row 1 has 2 elements
        jaggedArray[2] = new int[4]; // Row 2 has 4 elements

        // Populate the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;

        jaggedArray[1][0] = 4;
        jaggedArray[1][1] = 5;

        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;
        jaggedArray[2][2] = 8;
        jaggedArray[2][3] = 9;

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
