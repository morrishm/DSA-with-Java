package Methods;

public class MethodWithParameters {

    // This method takes two parameters:
    // num   -> the number whose table we want
    // limit -> how many rows we want
    static void printTable(int num, int limit) {

        // Run the loop from 1 to the given limit
        for (int i = 1; i <= limit; i++) {

            // Print the multiplication result
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        System.out.println("Table of 5:");

        // 5  -> goes into num
        // 10 -> goes into limit
        printTable(5, 10);

        System.out.println();

        System.out.println("Table of 7:");

        // 7 -> goes into num
        // 5 -> goes into limit
        printTable(7, 5);
    }
}