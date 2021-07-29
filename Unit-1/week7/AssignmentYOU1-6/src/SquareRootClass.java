public class SquareRootClass extends Calculator{
    @Override
    public void calculate(double x) {
        double a=Math.sqrt(x);
        System.out.println("The squareroot of "+x+" is "+(int)a);
    }
}
