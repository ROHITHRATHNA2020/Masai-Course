import java.util.Scanner;

public class FitSquares {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            while(t --> 0){
                int n=scanner.nextInt();
                int count=0;
                while(n>0){
                    n=n-2;
                    count=count+(n/2);
                }
                System.out.println(count);
            }
        }catch(Exception e){
            return;
        }
    }
}
