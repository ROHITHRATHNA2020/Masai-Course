import java.util.Scanner;

public class LShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= scanner.nextInt();
            }
        }
        for(int t=0;t<n;t++){
            for(int i=0;i<n-t;i++){
                for(int j=t;j<m;j++){
                    if(j==t  ||  i==n-t-1){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
        }
    }
}
