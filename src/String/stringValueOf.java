package String;

public class stringValueOf {
    public static void main(String[] args) {

        int number = 100;
        double price = 99.50;
        boolean result = true;

        // String.valueOf() converts different data types
        // into a String.
        String str1 = String.valueOf(number);
        String str2 = String.valueOf(price);
        String str3 = String.valueOf(result);

        System.out.println("Integer as String: " + str1);
        System.out.println("Double as String: " + str2);
        System.out.println("Boolean as String: " + str3);
    }
}