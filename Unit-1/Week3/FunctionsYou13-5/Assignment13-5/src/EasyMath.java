import java.util.Scanner;

public class EasyMath {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            while(t --> 0){
                int n=scanner.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=scanner.nextInt();
                }
                int max=0;
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        int product=1;
                        int sum=0;
                        product=arr[i]*arr[j];
                        while(product>0){
                            int remainder=product%10;
                            product=product/10;
                            sum=sum+remainder;
                        }

                        if(max<sum){
                            max=sum;
                        }
                    }
                }
                System.out.println(max);
            }
        }catch(Exception e){
            return;
        }
    }
}
