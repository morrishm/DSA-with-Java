package String;

public class printEachCharacter {

    // Function to print every character of the String
    public static void printCharacters(String str) {

        // Loop through every index of the String
        for (int i = 0; i < str.length(); i++) {

            // charAt() gets the character at the current index
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        String str = "Hello";

        // Calling the function
        printCharacters(str);
    }
}