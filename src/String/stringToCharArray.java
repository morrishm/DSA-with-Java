package String;

public class stringToCharArray {
    public static void main(String[] args) {

        String str = "Hello";

        // toCharArray() converts the String into a character array.
        char[] characters = str.toCharArray();

        // Each character is stored at a separate index.
        for (int i = 0; i < characters.length; i++) {
            System.out.println("Index " + i + ": " + characters[i]);
        }
    }
}