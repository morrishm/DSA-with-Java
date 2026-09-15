package String;

public class stringTrim {
    public static void main(String[] args) {

        String str = "   Hello World   ";

        // trim() removes extra spaces from the beginning and end
        // of the String.
        String result = str.trim();

        System.out.println("Before trim: " + str);
        System.out.println("After trim: " + result);
    }
}