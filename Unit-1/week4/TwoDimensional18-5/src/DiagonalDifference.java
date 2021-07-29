import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        for(int i=0,j=n-1;i<n;i++,j--){
            sum1=sum1+arr[i][i];
            sum2=sum2+arr[i][j];
        }
        if(sum1>sum2){
            System.out.println(sum1-sum2);
        }else{
            System.out.println(sum2-sum1);
        }
    }
}
