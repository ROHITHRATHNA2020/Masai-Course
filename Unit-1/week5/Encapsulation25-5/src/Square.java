public class Square extends Shape {
    private int side;

    public Square(int side){
        this.side=side;
    }

    @Override
    public void calculatePerimeter(){
        int perimeter=2*side;
        System.out.println("Perimeter of the square "+perimeter);
    }

    @Override
    public void calculateArea() {
        int area=side*side;
        System.out.println("Area of the square "+area);
    }
}
