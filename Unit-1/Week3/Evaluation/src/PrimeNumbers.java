import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int l= scanner.nextInt();
        int r= scanner.nextInt();
        for(int i=l;i<=r;i++){
            boolean isPrime=false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=true;
                }
            }
            if(isPrime==false){
                System.out.println(i+" Prime Number");
            }else{
                System.out.println(i+" Not a PM");
            }
        }
    }
}
