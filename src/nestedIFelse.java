public class nestedIFelse {
    public static void main(String[] args) {

        boolean passInExam = true;
        int totalMarks = 20;

        if (passInExam) {
            if (totalMarks >= 35) {
                System.out.println("You can move forward");
            } else {
                System.out.println("You have to practice more");
            }
        } else {
            System.out.println("Work hard and practice more");
        }
    }
}