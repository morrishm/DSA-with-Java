package Array;

import java.util.Scanner;

public class takingInputArray {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("provide input for index "+i);
            arr[i] = sc.nextInt();
        }

        for (int val : arr) {
            System.out.println("Your array contains ");
            System.out.println(val);
        }
    }
}