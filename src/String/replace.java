package String;

public class replace {
    public static void main(String[] args) {

        String str = "I like Java";

        // This version replaces one String with another String.
        String result = str.replace("Java", "Python");

        System.out.println("Original String: " + str);
        System.out.println("After replacement: " + result);
    }
}