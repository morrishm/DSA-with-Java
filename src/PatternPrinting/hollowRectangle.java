package PatternPrinting;

public class hollowRectangle {
    public static void main(String[] args) {

        int n = 4;

        // Outer loop controls the rows
        for (int row = 1; row <= n; row++) {

            // Inner loop controls the columns
            // Rectangle has 6 columns
            for (int col = 1; col <= 6; col++) {

                // Print star if:
                // 1. First row
                // 2. Last row
                // 3. First column
                // 4. Last column
                if (row == 1 || row == n || col == 1 || col == 6) {
                    System.out.print("* ");
                }

                // For all other positions, print space
                else {
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}