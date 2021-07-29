import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        while(t -->0){
            int n= scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= scanner.nextInt();
            }
            int count=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
