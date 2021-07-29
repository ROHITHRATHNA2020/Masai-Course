public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.holder_name = "Rohith";
        atm.total_balance = 10100.20;
        atm.withdraw(5000);
        System.out.println("Welcome to HDFC Bank ATM " + atm.holder_name);
        atm.printBalance();
    }
}
