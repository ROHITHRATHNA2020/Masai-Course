import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your father age and name");
        int age= scanner.nextInt();
        scanner.nextLine();
        String name= scanner.nextLine();
        System.out.println("My father's age is "+age);
        System.out.println("name is "+name);
    }
}
