import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1 || i==n-1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
