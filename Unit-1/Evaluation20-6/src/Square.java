import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m=n;
        int sum=0;
        char[][] a = new char[n][m];
        String[] arr =  new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scanner.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=arr[i].charAt(j);
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=n-i-1;j>=n/2;j--){
                if(arr[i].equals(arr[j])){
                    sum++;
                    break;
                }else{
                    break;
                }
            }
        }
        System.out.println(sum);
        for(int i=0;i<m/2;i++){
            for(int j=m-i-1;j>=m/2;j--){
                if(arr[i].equals(arr[j])){
                    sum++;
                    break;
                }else{
                    break;
                }
            }
        }

    }
}
