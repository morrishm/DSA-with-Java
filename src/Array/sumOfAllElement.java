package Array;

public class sumOfAllElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i<arr.length;i++){  //int i = 0; i<=n-1;i++ we can write also
             int value = arr[i];
             sum = sum+value;
        }
        System.out.println("The sum of all element of ARR is "+sum);
    }
}
