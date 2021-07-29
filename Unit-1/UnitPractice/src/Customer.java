public class Customer {
    private String name;
    private String password;
    private String accountNumber;
    private int startingBalance;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(int startingBalance) {
        this.startingBalance = startingBalance;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void deposit(int amount) {
        startingBalance = startingBalance + amount;
        System.out.println("Amount Deposited Successfully. Total balance available is " + startingBalance);
    }

    public void withdrawal(int amount){
        if(amount>=startingBalance){
            System.out.println("Insuffient Funds");
        }else{
            startingBalance = startingBalance - amount;
            System.out.println("Amount withdrawal Successful. Available balance is "+startingBalance);
        }
    }


}
