import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Grade Obtained");
        String Grade= scanner.next();
        switch(Grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs a lot of Improvement");
                break;
            case "E":
                System.out.println("Failed");
                break;
        }

    }
}
