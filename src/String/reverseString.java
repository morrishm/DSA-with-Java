package String;

public class reverseString {

    // Function to reverse the String
    public static String reverse(String str) {

        String reversed = "";

        // Start from the last character
        // and move towards the first character.
        for (int i = str.length() - 1; i >= 0; i--) {

            // Add each character to the reversed String
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String str = "Hello";

        // Calling the reverse function
        String result = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + result);
    }
}