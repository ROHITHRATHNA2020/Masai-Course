public class Alto extends Car{

    public Alto(){
        System.out.println("Alto has 2 headlights ");
    }

    @Override
    public String getRegistrationNumber() {
        return "KA-05-EJ-4469";
    }

    @Override
    public void steering() {
        System.out.print("Alto has ordinary steering and has ");
    }

    @Override
    public void braking(int power) {
        System.out.print("brake power 1500units");
    }
}
