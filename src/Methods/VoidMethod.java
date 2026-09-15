package Methods;

public class VoidMethod {

    // This is a void method.
    // void means: this method does NOT return any value.
    static void sayHello() {

        // This method simply prints a message.
        System.out.println("Hello, Welcome to Java!");
    }

    public static void main(String[] args) {

        // Calling the void method.
        // The method will execute and print its message.
        sayHello();

        // We can call the same method again.
        sayHello();
    }
}