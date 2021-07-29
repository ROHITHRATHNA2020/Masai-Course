import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(isOdd(n));

    }
    public static boolean isOdd(int n){
        for(int i=0;i<n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
     if(n%2==0){
         return false;
     }else
         return true;
    }

}
