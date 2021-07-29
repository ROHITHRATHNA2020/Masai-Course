import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int value=0;
        for(int i=1;i<Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                value=i;
            }
        }
        System.out.println(value);
    }
}
