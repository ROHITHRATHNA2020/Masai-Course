
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the length and breadth of the Rectangle");
        double length= scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double Rectangle = length*breadth;
        System.out.println("area of the Rectangle "+Rectangle);
    }
}
