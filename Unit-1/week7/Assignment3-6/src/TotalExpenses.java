import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int quantity= scanner.nextInt();
        double price= scanner.nextInt();
        double total=quantity*price;
        if(total>5000){
            total=total-(total*10/100);
            System.out.println(total);
        }else{
            System.out.println(total);
        }
    }
}
