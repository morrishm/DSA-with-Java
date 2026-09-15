package Array_2D;

import java.util.Scanner;

public class inputIn2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking the number of rows from the user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Taking the number of columns from the user
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Creating a 2D array with the given rows and columns
        int[][] arr = new int[rows][columns];

        // Outer loop is used to move through each row
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {

            // Inner loop is used to move through each column
            for (int colIndex = 0; colIndex < columns; colIndex++) {

                // Taking input for the current element
                System.out.print(
                        "Enter element at [" + rowIndex + "][" + colIndex + "]: "
                );

                arr[rowIndex][colIndex] = sc.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("\nThe 2D Array is:");

        // Outer loop goes through each row
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {

            // Inner loop prints all elements of the current row
            for (int colIndex = 0; colIndex < columns; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }

            // Move to the next line after completing one row
            System.out.println();
        }

        sc.close();
    }
}