import java.util.Scanner;

public class DayShort {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the day of the week");
        String day=scanner.next();
        if(day.equals("monday")){
            System.out.println("Mon");
        }else if(day.equals("Tuesday")){
            System.out.println("Tue");
        }else if(day.equals("wednesday")){
            System.out.println("Wed");
        }else if(day.equals("Thursday")) {
            System.out.println("Thurs");
        }else if(day.equals("Friday")) {
            System.out.println("Fri");
        }else if(day.equals("Saturday")) {
            System.out.println("Sat");
        }else if(day.equals("Sunday")) {
            System.out.println("Sun");
        }
    }
}
