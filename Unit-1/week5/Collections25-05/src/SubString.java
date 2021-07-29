import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str= scanner.next();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String s="";
                for(int k=i;k<=j;k++){
                    s=s+str.charAt(k);
                }
                if(s.charAt(0)==s.charAt(s.length()-1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
