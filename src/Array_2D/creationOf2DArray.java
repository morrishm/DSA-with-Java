package Array_2D;

public class creationOf2DArray {
    public static void main(String[] args) {

        int[][] arr;
        arr = new int[3][4];

        int[][] brr = {
                {1, 2},
                {3, 5},
                {7, 4},
                {7, 1}
        };

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {

            for (int col = 0; col < colLength; col++) {
                System.out.print(brr[rowIndex][col] + " ");
            }

            System.out.println();
        }
    }
}