import java.util.Scanner;

public class LPS {
    public static void main(String[] args) {
        String str = "tst";
        int n = str.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String s = "";
                s = str.substring(i, j+1);
                if (palindrome(s) == true) {
                    if (max < s.length()) {
                        max = s.length();
                    }
                }
            }
        }
        System.out.println(max);
    }


    public static boolean palindrome(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            return true;
        }
        return false;
    }
}