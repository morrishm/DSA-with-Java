package String;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Value in nextLine "+str1);

        String str2 = sc.next();
        System.out.println("value in using next() "+str2);
    }
}
