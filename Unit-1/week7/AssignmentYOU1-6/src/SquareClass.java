public class SquareClass extends Calculator{

    @Override
    public void calculate(double x) {
        double a=x*x;
        System.out.println("The square of "+x+" is "+(int)a);
    }
}
