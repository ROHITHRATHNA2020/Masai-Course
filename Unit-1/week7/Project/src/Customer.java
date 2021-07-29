public class Customer {
    private String name;
    private String password;
    private String accountNumber;
    private int balance;
    private String role;

    public Customer(String name, String password, String accountNumber, int balance, String role) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance(int i) {
        return balance;
    }

    public String getRole() {
        return role;
    }

    public void setDepositAmount(int amount) {
        balance = balance + amount;
    }

    public void setWithdrawAmount(int amount){
        balance=balance-amount;
    }
    public void transfer(int amount){
        balance=balance-amount;
    }

    public int getBalance() {
        return balance;
    }
}
