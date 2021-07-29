public abstract class Car {
    String registrationNumber;

    public Car(){
    }

    public Car(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private void numberOfHeadLights() {
        System.out.println("Car has 2 head Lights");
    }

    public abstract void steering();

    public abstract void braking(int power);
}
