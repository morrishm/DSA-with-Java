package String;

public class stringSubstring {
    public static void main(String[] args) {

        String str = "Hello World";

        // substring() returns a part of the original String.
        // beginIndex is included, but endIndex is NOT included.
        String result = str.substring(0, 5);

        System.out.println("Substring: " + result);
    }
}