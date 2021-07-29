import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name and your age");
        String name= scanner.next();
        int age= scanner.nextInt();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
}
