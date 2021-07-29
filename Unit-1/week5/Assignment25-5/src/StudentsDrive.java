import java.util.Scanner;

public class StudentsDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Students in the batch");
        int n = scanner.nextInt();
        Students students = new Students();
        for (int i = 0; i < n; i++) {
            students.setName(scanner.next());
            students.setAge(scanner.nextInt());
            scanner.nextLine();
            students.setAddress(scanner.nextLine());
            System.out.println(students.getName());
            System.out.println(students.getAge());
            System.out.println(students.getAddress());
        }
    }
}

/*
 */