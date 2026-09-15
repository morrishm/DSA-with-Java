package Array;

public class FindMaxElement {
    public static void main(String[] args) {
        int arr[] = { 5 , -9 , 4 ,-8 ,9 ,2};
          int n = arr.length;
          int maxValue = arr[0];
          for ( int i =0;i<=n-1;i++ ){
              if(arr[i]>maxValue){
                  maxValue = arr[i];

              }
        }
        System.out.println(maxValue);
    }
}
