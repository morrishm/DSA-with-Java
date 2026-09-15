package String;

public class stringReplace {
    public static void main(String[] args) {

        String str = "Hello World";

        // replace() replaces every occurrence of the old character
        // with the new character.
        String result = str.replace('o', 'a');

        System.out.println("Original String: " + str);
        System.out.println("After replacement: " + result);
    }
}