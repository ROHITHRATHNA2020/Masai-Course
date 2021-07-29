public class Commercial {
     String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateBill(int unit){
        int amount=unit*5;
        System.out.println("Bill Amount = "+amount+" Rs");
    }
}
