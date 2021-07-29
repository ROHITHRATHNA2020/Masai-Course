import java.util.Scanner;

public class Main {
    private static final int[] question = {1, 2, 3, 4, 5};
    private static boolean giveUp;
    private static boolean solved;
    private static int index;


    public static void main(String[] args) {


        solveQuestion(question[index]);
    }


    public static void solveQuestion(int questionNumber) {
        while (index <= 5) {
            if (giveUp) {
                System.out.println("View the Code");
                solveQuestion(index);
            } else {
                System.out.println("Come on, You can do it ");
                new Scanner(System.in).nextLine();
                continue;
            }
        }
    }
}
