public class Car {
    String name;
    String color;
    int maxSpeed;
    int noOfGears;

    public Car(String name,String color,int maxSpeed,int noOfGears){
        this.name=name;
        this.color=color;
        this.maxSpeed=maxSpeed;
        this.noOfGears=noOfGears;
    }

    public static void main(String[] args) {
       getVehiclesDetails();

    }


    public static void getVehiclesDetails( ){
        Car car = new Car("Rocky","Red",120,6);
        Car car1=new Car("ramu","yellow",4,3);
        System.out.println("car name "+car.name);
        System.out.println("car color "+car.color);
        System.out.println("car maxspeed "+car.maxSpeed);
        System.out.println("car gears "+car.noOfGears);
        System.out.println("car name "+car1.name);
        System.out.println("car color "+car1.color);
        System.out.println("car maxspeed "+car1.maxSpeed);
        System.out.println("car gears "+car1.noOfGears);

    }
}
