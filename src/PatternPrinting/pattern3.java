package PatternPrinting;

public class pattern3 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Inner loop prints stars according to the row number.
            // Row 1 → 1 star
            // Row 2 → 2 stars
            // Row 3 → 3 stars
            // Row 4 → 4 stars
            // Row 5 → 5 stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Move to the next line after completing one row.
            System.out.println();
        }
    }
}