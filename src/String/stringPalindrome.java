package String;

public class stringPalindrome {

    // Function to check whether a String is palindrome
    public static boolean isPalindrome(String str) {

        String reversed = "";

        // Reverse the String
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare original String with reversed String
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String str = "madam";

        // Calling the function
        boolean result = isPalindrome(str);

        if (result) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}