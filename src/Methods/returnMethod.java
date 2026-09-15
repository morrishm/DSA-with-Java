package Methods;

public class returnMethod {
    static void printMultiplication(int a, int b){
        int ans = a*b;
        System.out.println("result " + ans);
        return;
    }

    public static void main(String[] args) {
        printMultiplication(5,10);
    }
}


