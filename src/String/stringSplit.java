package String;

public class stringSplit {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        // split() breaks the String into multiple parts.
        // Here, " " means we want to split the String wherever
        // a space is found.
        String[] words = str.split(" ");

        // The result of split() is stored in a String array.
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}