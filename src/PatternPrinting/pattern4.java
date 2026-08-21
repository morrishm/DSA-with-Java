package PatternPrinting;

public class pattern4 {
    public static void main(String[] args) {

        // n represents the number of rows and stars in each row.
        int n = 5;

        // Outer loop controls the number of rows.
        for (int row = 1; row <= n; row++) {

            // Print spaces before printing stars.
            // Number of spaces decreases by 1 in every row.
            //
            // Row 1 → n - row = 5 - 1 = 4 spaces
            // Row 2 → n - row = 5 - 2 = 3 spaces
            // Row 3 → n - row = 5 - 3 = 2 spaces
            // Row 4 → n - row = 5 - 4 = 1 space
            // Row 5 → n - row = 5 - 5 = 0 spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Print 5 stars in every row.
            // The number of stars remains constant because
            // the condition is col <= n.
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            // Move to the next line after completing one row.
            System.out.println();
        }
    }
}