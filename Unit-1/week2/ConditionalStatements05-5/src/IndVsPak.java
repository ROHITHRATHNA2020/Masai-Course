import java.util.Scanner;

public class IndVsPak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int indScore= scanner.nextInt();
        int pakScore= scanner.nextInt();
        if(indScore>pakScore){
            System.out.println("India wins");
        }else if(pakScore>indScore){
            System.out.println("Pak wins");
        }else{
            System.out.println("Match Tied");
        }
    }
}
