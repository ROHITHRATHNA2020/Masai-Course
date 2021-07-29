import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
            }else{
                oddSum=oddSum+arr[i];
            }
        }
        if(evenSum>oddSum){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}