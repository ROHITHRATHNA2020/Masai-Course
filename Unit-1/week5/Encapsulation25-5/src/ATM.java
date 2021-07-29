public class ATM extends Bank{

    public ATM(String name, int balance) {
        super(name, balance);
    }
    public void withdraw(double withDrawAmt, double totalBalance){
        totalBalance=totalBalance-withDrawAmt;
        System.out.println("Remaining Balance is "+totalBalance );

    }


    public void printBalance(double withDrawAmt,double totalBalance){
        totalBalance=totalBalance-withDrawAmt;
        System.out.println("Remaining Balance is "+totalBalance );
    }
}
