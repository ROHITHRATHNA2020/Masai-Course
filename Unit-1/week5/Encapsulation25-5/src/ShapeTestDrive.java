public class ShapeTestDrive {
    public static void main(String[] args) {
    Rectangle rectangle= new Rectangle(3,4);
    rectangle.calculatePerimeter();
    rectangle.calculateArea();

        System.out.println("---------------------------");

        Square square= new Square(2);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
