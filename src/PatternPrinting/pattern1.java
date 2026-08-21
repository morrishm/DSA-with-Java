package PatternPrinting;

public class pattern1 {
    public static void main(String[] args) {

        // n represents the size of the square.
        // Here, n = 5 means we want 5 rows and 5 columns.
        int n = 5;

        // Outer loop controls the number of rows.
        for (int row = 1; row <= n; row++) {

            // Inner loop controls the number of columns
            // inside each row.
            for (int col = 1; col <= n; col++) {

                // Print one star followed by a space.
                System.out.print("* ");
            }

            // Move the cursor to the next line
            // after completing one complete row.
            System.out.println();
        }
    }
}