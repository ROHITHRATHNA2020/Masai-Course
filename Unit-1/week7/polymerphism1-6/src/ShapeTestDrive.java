public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape square = new Square(3);
        square.calculateArea();
        Shape rectangle = new Rectangle(2, 4);
        rectangle.calculateArea();

    }
}
