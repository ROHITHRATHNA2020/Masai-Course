import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            while(t --> 0){
                int n=scanner.nextInt();
                int x=1;
                while(x<n) {
                    int y = (x * (x + 1)) / 2;
                    if (y == n) {
                        break;
                    } else if (y < n) {
                        x++;
                    } else {
                        x=x-1;
                        break;
                    }
                }
                System.out.println(x);
            }
        }catch(Exception e){
            return;
        }
    }
}
