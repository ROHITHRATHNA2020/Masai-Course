public class CubeClass extends Calculator{
    @Override
    public void calculate(double x) {
        double a=x*x*x;
        System.out.println("The cube of "+x+" is "+(int)a);
    }
}
