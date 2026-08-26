package PatternPrinting;

public class hollowPyramid {

    public static void main(String[] args) {

        int n = 5; // Number of rows

        // Outer loop -> controls the rows
        for (int row = 1; row <= n; row++) {

            // 1. Print spaces before the stars
            // These spaces move the stars towards the center
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // 2. Print stars/spaces inside the pyramid
            // Number of positions = 2 * row - 1
            for (int col = 1; col <= 2 * row - 1; col++) {

                // Print star at:
                // 1. First position
                // 2. Last position
                // 3. Last row
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("* ");
                } else {
                    // Empty space -> makes the pyramid hollow
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}