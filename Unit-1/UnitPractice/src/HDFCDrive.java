import java.util.ArrayList;
import java.util.Scanner;

public class HDFCDrive {

    static Customer customer = new Customer();
    static Admin admin = new Admin();
    static ArrayList<Customer> customerlist = new ArrayList<>();
    static ArrayList<Admin> adminlist = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HDFC bank");

        choice();

        scanner.close();
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice\n" +
                "1 -> Create account\n" +
                "2 -> Login\n" +
                "3 -> Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                login();
                break;
            case 3:
                Exit();
                break;
        }
        scanner.close();
    }

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a New Account");
        System.out.println("Enter the Name");
        String name = scanner.next();
        customer.setName(name);
        System.out.println("Enter the Password");
        String password = scanner.next();
        customer.setPassword(password);
        System.out.println("Enter the Account Number");
        String accountNumber = scanner.next();
        customer.setAccountNumber(accountNumber);
        System.out.println("Enter the starting balance");
        int balance = scanner.nextInt();
        scanner.nextLine();
        customer.setStartingBalance(balance);
        System.out.println("Enter the Role");
        String role = scanner.next();
        if (role.equals("Customer")) {
            customerlist.add(customer);
        } else if (role.equals("Admin")) {
            adminlist.add(admin);
        }
        System.out.println("You have Created the Account Successfully");
        System.out.println();
        choice();
        scanner.close();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accountNumber = scanner.next();
        System.out.println("Enter the Passowrd");
        String password = scanner.next();
        Customer customer = null;
        Admin admin = null;
        for (int i = 0; i < Math.max(customerlist.size(), adminlist.size()); i++) {
            if (accountNumber.equals(customerlist.get(i).getAccountNumber()) && password.equals(customerlist.get(i).getPassword())) {
                System.out.println("Login Successful. You are HDFC Customer");
                customer = customerlist.get(i);
                customerLogin(customer);
                break;
            }
            if (accountNumber.equals(adminlist.get(i).getAccountNumber()) && password.equals(adminlist.get(i).getPassword())) {
                System.out.println("Login Successful. You are HDFC Admin");
                admin = adminlist.get(i);
                adminLogin(admin);
                break;
            } else {
                System.out.println("Account Doesnot Exist with this Credentials. Retry");
            }
        }

        scanner.close();
    }

    public static void customerLogin(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice\n" +
                "1.Deposit\n" +
                "2.Withdraw money\n" +
                "3.Transfer\n" +
                "4.Show balance\n" +
                "5.Exit");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: deposit(customer);
            break;
            case 2: withdrawAmount(customer);
            break;
            case 3: Transfer(customer);
            break;
            case 4:showBalance(customer);
            break;
            case 5:Exit();
            break;
        }
        scanner.close();
    }

    public static void deposit(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount to be Deposit");
        int amount= scanner.nextInt();
        customer.deposit(amount);
        scanner.close();
    }
    public static void withdrawAmount(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal Amount");
        int n = scanner.nextInt();
        customer.withdrawal(n);
        scanner.close();
    }
    public static void Transfer(Customer customer){

    }
    public static void showBalance(Customer customer){

    }

    public static void adminLogin(Admin admin) {

    }


    public static void Exit() {
        System.exit(0);
    }
}
//    Scanner scanner = new Scanner(System.in);
//      scanner.close();