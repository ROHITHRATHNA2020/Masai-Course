public class CDdrive {
    public static void main(String[] args) {
        Commercial commercial= new Commercial();
        commercial.setName("Raj Kumar");
        System.out.println("Customer "+commercial.getName());
        commercial.calculateBill(100);
        Domestic domestic= new Domestic();
        domestic.setName("Lalith Raj");
        System.out.println("Customer "+domestic.getName());
        domestic.calculateBill(100);
    }
}
