package Array_2D;

public class jackedArray {
    public static void main(String[] args) {

        // A jagged 2D array where each row can have a different number of columns
        int[][] brr = {
                {1, 2},                  // Row 0 → 2 elements
                {2, 3, 4, 5},            // Row 1 → 4 elements
                {3, 4, 4, 5, 6, 7},      // Row 2 → 6 elements
                {4}                      // Row 3 → 1 element
        };

        // Returns the total number of rows
        int rowLength = brr.length;

        // Outer loop is used to access each row
        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {

            // Each row can have a different number of columns,
            // so we find the column length for the current row
            int colLength = brr[rowIndex].length;

            // Inner loop is used to access each element of the current row
            for (int col = 0; col <= colLength - 1; col++) {

                // Print the current element
                // brr[rowIndex][col] means: rowIndex → row, col → column
                System.out.print(brr[rowIndex][col] + " ");
            }

            // Move to the next line after printing one complete row
            System.out.println();
        }
    }
}