package String;

public class stringIsBlank {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "   ";
        String str3 = "Hello";

        // isBlank() checks whether the String is empty
        // or contains only whitespace characters.
        boolean result1 = str1.isBlank();
        boolean result2 = str2.isBlank();
        boolean result3 = str3.isBlank();

        System.out.println("Is str1 blank? " + result1);
        System.out.println("Is str2 blank? " + result2);
        System.out.println("Is str3 blank? " + result3);
    }
}