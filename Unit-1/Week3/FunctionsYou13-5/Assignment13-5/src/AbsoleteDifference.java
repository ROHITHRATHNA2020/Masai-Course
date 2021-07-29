import java.util.Scanner;

public class AbsoleteDifference {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        while( t --> 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            absoleteDifference(a, b);
        }
    }
    public static void absoleteDifference(int a, int b){
        if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
    }
}
