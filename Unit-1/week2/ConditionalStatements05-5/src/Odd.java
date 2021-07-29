import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        if(number%2==1){
            System.out.println("Odd Number");
        }
    }
}
