import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int currentYear= scanner.nextInt();
        int yearOfBirth= scanner.nextInt();
        int age=currentYear-yearOfBirth;
        System.out.println(age);
    }
}
