package Array;

public class multiplicationOfArray {
    public static void main(String[] args) {
        int arr[ ] = {10, 20 , 30, 40};
        int ans = 1;
        int n = arr.length;
        for (int i = 0; i<=n-1;i++){
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);
    }

}
