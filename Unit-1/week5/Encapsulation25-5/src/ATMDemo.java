public class ATMDemo  {
    public static void main(String[] args) {
        ATM atm= new ATM("Ram Das Ghokale",10000);
        System.out.println("Welcome "+atm.name+" to HDFC Bank ATM");
        atm.printBalance(1000,10000);
    }
}
