public class Triangle {
    private int base;
    private int side1;
    private int side2;

    public Triangle(int base, int side1, int side2) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }
    public void calculatePerimeter(){
        int perimeter=base+side1+side2;
        System.out.println("The perimeter of a triangle is "+perimeter+" sq.cm");
    }
}
