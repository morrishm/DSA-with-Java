package Loop;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i<=3;i++){
            for (int j = 1; j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Let's understand with another examples");
        for (int k = 1; k<=4; k++){
            for (int l = 1; l<=5;l++){
                System.out.println("Value of k is :"+ k + " and l :"+l);
            }
            System.out.println();
        }
    }
}
