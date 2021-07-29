public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of the square is "+side * side);
    }
}
