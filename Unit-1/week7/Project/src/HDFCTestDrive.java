import java.util.ArrayList;
import java.util.Scanner;

public class HDFCTestDrive {
    static ArrayList<Customer> customerList = new ArrayList<>();
    static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO HDFC BANK");
        choice();
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.CREATE YOUR ACCOUNT\n" +
                "2.LOGIN \n" +
                "3.EXIT");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                createAccount();
                break;
            case 2:
                login();
                break;
            case 3:
                exit();
                break;
        }
        scanner.close();
    }

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Name");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter the Password");
        String password = scanner.next();
        System.out.println("Enter the Account Number");
        String accountNumber = scanner.next();
        System.out.println("Enter the Starting Balance");
        int startingBalance = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Role Customer or Employee");
        String role = scanner.next();
        if (role.equals("Customer")) {
            Customer customer = new Customer(name, password, accountNumber, startingBalance, role);
            customerList.add(customer);
            System.out.println("Account Created Successfully");
            System.out.println("The Number of accounts created in the bank are " + customerList.size());
        } else if (role.equals("Employee")) {
            Employee employee = new Employee(name, password, accountNumber, startingBalance, role);
            employeeList.add(employee);
            System.out.println("Account Created Successfully");
            System.out.println("The Number of accounts created in the bank are " + employeeList.size());
        }
        choice();
        scanner.close();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number");
        String accountNumber = scanner.next();
        System.out.println("Enter the Password");
        String password = scanner.next();
        Customer customer = null;
        Employee employee = null;
        boolean isCustomerPresent = false;
        boolean isEmployeePresent=false;
        for (int i = 0; i < customerList.size(); i++) {
            if (accountNumber.equals(customerList.get(i).getAccountNumber()) && password.equals(customerList.get(i).getPassword())) {
                customer = customerList.get(i);
                isCustomerPresent = true;
                break;
            }
        }
        for(int i=0;i< employeeList.size();i++){
            if (accountNumber.equals(employeeList.get(i).getAccountNumber()) && password.equals(employeeList.get(i).getPassword())) {
                employee = employeeList.get(i);
                isEmployeePresent = true;
                break;
            }
        }
        if (isCustomerPresent == true || isEmployeePresent==true) {
            if (isCustomerPresent == true) {
                System.out.println("Login successful, you are an HDFC customer.");
                afterLogin(customer);
            } else if (isEmployeePresent == true) {
                System.out.println("Login successful, you are an HDFC Employee.");
                employeeLogin(employee);
            } else {
                System.out.println("Account Number or Password is incorrect");
            }
        }
        scanner.close();
    }
    public static void afterLogin(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Choice\n" +
                "1.Deposit\n" +
                "2.Withdraw Money\n" +
                "3.Transfer\n" +
                "4.Show Balance\n" +
                "5.Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> deposit(customer);
            case 2 -> withdrawAmount(customer);
            case 3 -> transfer(customer);
            case 4 -> showBalance(customer);
            case 5 -> exit();
        }
        scanner.close();
    }

    public static void exit() {
        System.exit(0);
    }

    public static void deposit(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much amount you are deposting");
        int amount = scanner.nextInt();
        customer.setDepositAmount(amount);
        System.out.println("The total balance after deposit is " + customer.getBalance());
        scanner.close();
    }

    public static void withdrawAmount(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw");
        int amount = scanner.nextInt();
        customer.setWithdrawAmount(amount);
        System.out.println("The Remaining Balance after withdrawal is " + customer.getBalance());
        scanner.close();
    }

    public static void transfer(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the amount to transfer");
        int amount = scanner.nextInt();
        customer.transfer(amount);
        System.out.println("Transferred Amount Successfully. Remaining Balance is" + customer.getBalance());
        scanner.close();
    }

    public static void showBalance(Customer customer) {
        System.out.println(customer.getBalance());
    }

    public static void employeeLogin(Employee employee) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Choice\n" +
                "1.Show total number of accounts in the bank.\n" +
                "2.Search an account\n" +
                "3.Show Total balance in the bank\n" +
                "4.Exit\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                totalAccounts();
                break;
            case 2:
                searchAccount();
                break;
            case 3:
                totalbalance(employee);
                break;
            case 4:
                exit();
                break;
        }
        scanner.close();
    }

    public static void totalAccounts() {
        System.out.println(employeeList.size());
    }

    public static void searchAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number to search");
        String accountNumber = scanner.next();
        for (int i = 0; i < employeeList.size(); i++) {
            if (accountNumber.equals(employeeList.get(i).getAccountNumber())) {
                System.out.println("Account Name "+employeeList.get(i).getName()+" Account Balance "+employeeList.get(i).getBalance(i));
                break;
            }
        }
        scanner.close();
    }

    public static void totalbalance(Employee employee) {
        int amount = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            amount = amount + employee.getBalance(i);
        }
        System.out.println(amount);
    }

}

