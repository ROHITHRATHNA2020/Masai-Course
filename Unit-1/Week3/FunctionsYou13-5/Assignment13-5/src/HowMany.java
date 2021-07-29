import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        try{
            Scanner scanner= new Scanner(System.in);
            long n=scanner.nextLong();
            int count=0;
            long temp=n;
            while(temp>0){
                count++;
                temp=temp/10;
            }
            System.out.println(count);
        }catch(Exception e){
            return;
        }
    }
}
