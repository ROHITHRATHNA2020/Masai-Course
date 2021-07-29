import java.util.Scanner;

public class prime {
    public static void isPrime(int n){
        boolean rohith=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                rohith=true;
                break;
            }
        }
        if(rohith==false){
            System.out.println("prime");
        }else{
            System.out.println("not Prime");
        }

    }

    public static void main(String[] args) {

        isPrime(4);
    }
}
