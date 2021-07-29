import java.util.Scanner;

public class TriangleDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1= scanner.nextInt();
        int base= scanner.nextInt();
        int side2 = scanner.nextInt();
        Triangle triangle = new Triangle(side1,base,side2);
        triangle.calculatePerimeter();
    }
}
