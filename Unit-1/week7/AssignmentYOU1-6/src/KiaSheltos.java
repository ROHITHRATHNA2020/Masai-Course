public class KiaSheltos extends Car {

    public KiaSheltos(){
        System.out.println("KiaSheltos has 2 headlights ");
    }

    @Override
    public String getRegistrationNumber() {
        return "TN-12-RN-4567";
    }

    @Override
    public void steering() {
        System.out.print("KiaSheltos has power steering and has ");
    }

    @Override
    public void braking(int power) {
        System.out.print("brake power of 2000units");
    }
}
