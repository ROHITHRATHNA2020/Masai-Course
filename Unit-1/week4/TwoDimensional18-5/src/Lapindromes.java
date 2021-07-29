import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            while(t-->0){
                String n=scanner.next();
                int l=n.length();
                int sum1=0;
                int sum2=0;
                for(int i=0;i<(l+1)/2;i++){
                    sum1=sum1+(char)(n.charAt(i));
                }
                for(int i=l/2;i<l;i++){
                    sum2=sum2+(char)(n.charAt(i));
                }
                if(sum1-sum2==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }catch(Exception e){
            return;
        }
    }
}
