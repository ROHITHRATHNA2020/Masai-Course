import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i*2;j++){
                if(j<=i){
                    System.out.print(i-j+1+" ");
                }else{
                    System.out.print(j-i+1+" ");
                }
            }
            System.out.println();
        }
    }
}
