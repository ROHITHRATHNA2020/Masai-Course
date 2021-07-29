import java.util.Scanner;

public class Divisible {
    public static void isdivisible(int n){
        if(n%5==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        isdivisible(n);
    }
}
