public class ATM extends Bank {

    public void withdraw(double amount) {
        if (amount > total_balance) {
            System.out.println("insufficient Funds");
        } else {
            total_balance = total_balance - amount;
        }

    }

    public void printBalance() {
        System.out.println("The balance is " + total_balance);
    }
}
