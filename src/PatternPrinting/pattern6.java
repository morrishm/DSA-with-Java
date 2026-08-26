package PatternPrinting;

public class pattern6 {
    public static void main(String[] args) {

        int n = 5;

        // Controls the number of rows
        for (int row = 1; row <= n; row++) {

            // Print spaces before the stars
            // As row increases, the number of spaces decreases
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Print stars
            // Number of stars = 2 * row - 1
            // row 1 → 1 star
            // row 2 → 3 stars
            // row 3 → 5 stars
            // row 4 → 7 stars
            // row 5 → 9 stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}