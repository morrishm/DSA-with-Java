package Array;

public class findMinValue {
    public static void main(String[] args) {
        int arr[]= { 0,6,4,8,1,4,7,-5};
        int minValue = arr[0];
        int n = arr.length;
        for(int i = 0; i<=n-1;i++){
            if (arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);

    }
}
