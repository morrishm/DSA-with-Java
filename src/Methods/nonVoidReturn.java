package Methods;

public class nonVoidReturn {
    static int add(int p, int q){
        int sum =p+q;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(8,44);
        System.out.println("Result "+result);
    }

}
