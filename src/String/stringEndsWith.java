package String;

public class stringEndsWith {
    public static void main(String[] args) {

        String str = "Hello.java";

        // endsWith() checks whether the String ends
        // with the given text.
        // It returns true or false.
        boolean result = str.endsWith(".java");

        System.out.println("Does String end with .java? " + result);
    }
}