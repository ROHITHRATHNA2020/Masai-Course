import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    public Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("Enter a choice");
        System.out.println("1. Add\n" +
                "2. Subtract\n" +
                "3. Divide\n" +
                "4. Multiply\n");
        Calculator calculate1=new Calculator(a,b);
        int n= scanner.nextInt();
        if(n==1){
            calculate1.add();
        }else if(n==2){
            calculate1.subtract();
        }else if(n==3){
            calculate1.divide();
        }else if(n==4){
            calculate1.multiply();
        }else{
            System.out.println("Invalid Number Entered");
        }
    }
    public void add(){
        System.out.println("The Sum of "+a+" and "+b+" is "+(a+b));
    }
    public void subtract(){
        System.out.println("The Subtraction of "+a+" and "+b+" is "+(a-b));
    }
    public void divide(){
        System.out.println("The Division of "+a+" and "+b+" is "+(a/b));
    }
    public void multiply(){
        System.out.println("The Product of "+a+" and "+b+" is "+(a*b));
    }
}
