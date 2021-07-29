import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        int n=str.length();
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--) {
                String s = "";
                s = s + str.substring(i, j+1);
                if (palindrome(s) == true) {
                    if (max < s.length()) {
                        max = s.length();
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static boolean palindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str)){
            return true;
        }
        return false;
    }
}
