import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        int A=scanner.nextInt();
        int B= scanner.nextInt();
        if(A<B){
            System.out.println("A is Smaller");
        }else{
            System.out.println("B is Smaller");
        }

    }
}
