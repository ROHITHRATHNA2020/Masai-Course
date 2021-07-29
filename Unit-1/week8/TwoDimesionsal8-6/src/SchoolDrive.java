import java.util.Scanner;

public class SchoolDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Spartans spartans = new Spartans();
        System.out.println("Enter student name");
        String name = scanner.next();
        spartans.setStudentName(name);
        System.out.println("Student ID");
        String id= scanner.next();
        spartans.setStudentID(id);
        System.out.println("Program Name");
        String programName=scanner.next();
        spartans.setProgramName(programName);
        System.out.println("IA Name");
        String iaName= scanner.next();
        spartans.setIAName(iaName);
        System.out.println("Batch Name");
        String batchName= scanner.next();
        spartans.setBatchName(batchName);
        spartans.display();

    }
}
