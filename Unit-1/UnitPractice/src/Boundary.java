import java.util.Scanner;

public class Boundary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[][] a= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i<n-1){
                    if(i==0 || j==n-1){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i>0){
                    if(i==n-1 || j==0){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
        }
    }
}
