import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t --> 0){
            int n =scanner.nextInt();
            int i=0;
            boolean isPresent=false;
            while(i<n){
                long x=(long)Math.pow(2,i);
                if(x==n){
                    isPresent=true;
                    break;
                }
                i++;
            }
            if(isPresent==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}