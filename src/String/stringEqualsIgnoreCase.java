package String;

public class stringEqualsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "HELLO";

        // equalsIgnoreCase() compares Strings without considering uppercase
        // and lowercase differences.
        boolean result = str1.equalsIgnoreCase(str2);

        System.out.println("Both Strings are equal: " + result);
    }
}