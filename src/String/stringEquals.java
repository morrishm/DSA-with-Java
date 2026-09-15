package String;

public class stringEquals {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        // equals() compares the actual content of two Strings.
        boolean result = str1.equals(str2);

        System.out.println("Both Strings are equal: " + result);
    }
}