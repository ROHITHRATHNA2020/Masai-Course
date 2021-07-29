import java.util.Scanner;

public class NumberSandwich {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int myNum= scanner.nextInt();
        if(myNum>=6 && myNum<=10){
            System.out.println("number is between 6 and 10");
        }
        if(myNum>5){
            System.out.println("greater than 5");
        }
        if(myNum<=12){
            System.out.println("number is less than or equal to 12");
        }
        if (myNum%7==0){
            System.out.println("number is divisible by 7");
        }
    }
}
