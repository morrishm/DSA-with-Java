package PatternPrinting;

public class pattern5 {
    public static void main(String[] args) {
        // n represents the total number of rows.
        int n = 5;

        // Outer loop controls the number of rows.
        // row will go from 1 to 5.
        for (int row = 1; row <= n; row++) {

            /*
             * Inner loop controls the number of stars in each row.
             *
             * Formula: n - row + 1
             *
             * Row 1 → 5 - 1 + 1 = 5 stars
             * Row 2 → 5 - 2 + 1 = 4 stars
             * Row 3 → 5 - 3 + 1 = 3 stars
             * Row 4 → 5 - 4 + 1 = 2 stars
             * Row 5 → 5 - 5 + 1 = 1 star
             */
            for (int col = 1; col <= n - row + 1; col++) {

                // Print one star for each iteration of the inner loop.
                System.out.print("* ");
            }

            // Move to the next line after completing one row.
            System.out.println();
        }
    }
}
