import java.util.Scanner;

public class Circle {
    float radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        Circle circle = new Circle(t);
        circle.getCircumference();
    }
    public  void getCircumference(){
        double c= 2*3.142*radius;
        System.out.println("Circumference of the Circle is "+c);
    }
}
