public class CarTestDrive {
    public static void main(String[] args) {
        Car alto = new Alto();
        System.out.println("The Registration number of Alto is "+alto.getRegistrationNumber());
        alto.steering();
        alto.braking(1500);
        System.out.println();
        System.out.println("-------------------------");
        Car kiaSheltos= new KiaSheltos();
        System.out.println("The Registration number of KiaSheltos is "+kiaSheltos.getRegistrationNumber());
        kiaSheltos.steering();
        kiaSheltos.braking(2000);
    }
}
