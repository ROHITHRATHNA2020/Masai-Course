import java.util.Scanner;

public class multiples {

    public static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        mul(n);
    }
}
