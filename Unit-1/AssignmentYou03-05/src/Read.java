import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age, Weight and name");
        int age= scanner.nextInt();
        float Weight= scanner.nextFloat();
        String name= scanner.nextLine();
        System.out.println("age is "+age);
        System.out.println("Weight age "+Weight);
        System.out.println("name is "+name);
    }
}
