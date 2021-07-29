import java.util.Scanner;

public class AssignmentDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment ftand = new FTAND();
        System.out.println("Enter the Assignment name");
        String name = scanner.next();
        ftand.setAssignmentName(name);
        System.out.println("Enter Assigment Link");
        String link= scanner.next();
        ftand.setAssignmentLink(link);
        ftand.display();

    }
}
