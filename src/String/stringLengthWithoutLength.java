package String;

public class stringLengthWithoutLength {

    // Function to count the number of characters
    public static int countLength(String str) {

        int count = 0;

        // Convert String into a character array
        char[] characters = str.toCharArray();

        // Each character represents one element
        for (char ch : characters) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Hello World";

        // Calling the function and storing the returned value
        int result = countLength(str);

        System.out.println("Length of String: " + result);
    }
}