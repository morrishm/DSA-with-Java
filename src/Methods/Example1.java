package Methods;

public class Example1 {

    static void PrintTableOf2() {

        for (int n = 1; n <= 10; n++) {
            System.out.println("-> " + 2 * n);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hiii");

        PrintTableOf2();

        System.out.println("BYE");
    }
}