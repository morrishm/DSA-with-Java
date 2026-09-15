package String;

public class stringIsEmpty {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "Hello";

        // isEmpty() checks whether the String has zero characters.
        // It returns true if the length of the String is 0.
        boolean result1 = str1.isEmpty();
        boolean result2 = str2.isEmpty();

        System.out.println("Is str1 empty? " + result1);
        System.out.println("Is str2 empty? " + result2);
    }
}