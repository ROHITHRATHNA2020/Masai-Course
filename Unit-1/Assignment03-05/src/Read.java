import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the name, age and date of birth");
        String name= scanner.next();
        int age= scanner.nextInt();
        String dob= scanner.next();
        System.out.println("name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Date of birth is "+dob);
    }
}
