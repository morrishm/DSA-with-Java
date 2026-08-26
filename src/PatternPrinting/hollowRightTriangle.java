package PatternPrinting;

public class hollowRightTriangle {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop controls the number of rows
        for (int row = 1; row <= n; row++) {

            // Inner loop controls the number of columns in each row
            for (int col = 1; col <= row; col++) {

                // Print star at:
                // 1. First column  -> col == 1
                // 2. Last column   -> col == row
                // 3. Last row      -> row == n
                if (col == 1 || col == row || row == n) {
                    System.out.print("* ");
                }
                else {
                    // Print space to make the triangle hollow
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}