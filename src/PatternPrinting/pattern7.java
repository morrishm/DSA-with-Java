package PatternPrinting;

public class pattern7 {
    public static void main(String[] args) {

        int n = 4;

        // Controls the number of rows
        for (int row = 1; row <= n; row++) {

            // Print spaces before stars
            // Spaces increase by 1 in every row
            // row 1 → 0 spaces
            // row 2 → 1 space
            // row 3 → 2 spaces
            // row 4 → 3 spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            // Print stars
            // Number of stars = 2 * n - 2 * row + 1
            // row 1 → 7 stars
            // row 2 → 5 stars
            // row 3 → 3 stars
            // row 4 → 1 star
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}