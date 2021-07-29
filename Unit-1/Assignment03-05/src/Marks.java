import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int subjects=6;
        int m1= scanner.nextInt();
        int m2= scanner.nextInt();
        int m3= scanner.nextInt();
        int m4= scanner.nextInt();
        int m5= scanner.nextInt();
        int m6= scanner.nextInt();
        int total=m1+m2+m3+m4+m5+m6;
        double avg=total/subjects;
        System.out.println(avg);
    }
}
