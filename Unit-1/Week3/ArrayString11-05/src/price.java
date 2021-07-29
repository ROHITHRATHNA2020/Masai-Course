import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            int[] arr={1,2,5,10,50,100};
            int count;
            while(t --> 0){
                count=0;
                int n=scanner.nextInt();
                int i=0;
                while(n!=0){
                    if(arr[i]==n){
                        count++;
                        break;
                    }else if(arr[i]>n){
                        n=n-arr[i-1];
                        count++;
                        i=0;
                    }else if(arr[arr.length-1]<n){
                        n=n-arr[arr.length-1];
                        count++;
                        i=0;
                    }else{
                        i++;
                    }
                }
                System.out.println(count);
            }
        }catch(Exception e){
            return;
        }
    }
}
