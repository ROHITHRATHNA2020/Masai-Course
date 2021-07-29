import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int sum=addNumbers(a,b);
        int total=addNumbers(sum,c);
        System.out.println(total);


    }
    public static int addNumbers(int a, int b){
        return a+b;
    }
}
