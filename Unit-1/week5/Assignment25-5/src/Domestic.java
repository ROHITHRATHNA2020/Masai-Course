public class Domestic extends Commercial {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void calculateBill(int unit) {
        double amount=unit*2.5;
        System.out.println("Bill Amount = "+amount+" Rs");
    }
}
