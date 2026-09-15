package String;

public class stringContains {
    public static void main(String[] args) {

        String str = "Hello World";

        // contains() checks whether the given sequence exists in the String.
        // It returns true if found, otherwise false.
        boolean result = str.contains("World");

        System.out.println("Contains World: " + result);
    }
}