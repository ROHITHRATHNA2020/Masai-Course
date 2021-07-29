import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int basicSalary= scanner.nextInt();
        double HRA1=basicSalary*10/100;
        int HRA2=500;
        double DA1=basicSalary*90/100;
        double DA2=basicSalary*98/100;
        double grossSalary=0;
        if(basicSalary>=1500){
            grossSalary=basicSalary+HRA2+DA2;
        }else{
            grossSalary=basicSalary+HRA1+DA1;
        }
        System.out.println(grossSalary);
    }
}
