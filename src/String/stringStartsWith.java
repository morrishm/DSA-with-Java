package String;

public class stringStartsWith {
    public static void main(String[] args) {

        String str = "Java Programming";

        // startsWith() checks whether the String starts
        // with the given text.
        // It returns true or false.
        boolean result = str.startsWith("Java");

        System.out.println("Does String start with Java? " + result);
    }
}