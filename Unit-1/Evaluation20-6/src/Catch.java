import java.util.Scanner;
public class Catch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while(t -->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x =Math.abs(a-b);
            if(a==b){
                System.out.println(a*a-a+1);
            }else if(a>b){
                int y =a*a-a+1;
                if(a%2==0){
                    System.out.println(x+y);
                }else{
                    System.out.println(y-x);
                }
            }else{
                int y=b*b-b+1;
                if(b%2==1){
                    System.out.println(x+y);
                }else{
                    System.out.println(y-x);
                }
            }
        }
    }
}



