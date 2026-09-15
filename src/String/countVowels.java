package String;

public class countVowels {

    // Function to count the number of vowels
    public static int countVowels(String str) {

        int count = 0;

        // Convert the String to lowercase so that
        // both uppercase and lowercase vowels can be checked easily.
        str = str.toLowerCase();

        // Check every character of the String
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check whether the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Hello World";

        // Calling the function
        int result = countVowels(str);

        System.out.println("Number of vowels: " + result);
    }
}