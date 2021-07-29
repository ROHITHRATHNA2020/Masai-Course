import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        double PI=3.142;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius= scanner.nextDouble();
        double circumference=2*PI*radius;
        System.out.println("Circumference Of Circle is "+circumference);

    }
}
