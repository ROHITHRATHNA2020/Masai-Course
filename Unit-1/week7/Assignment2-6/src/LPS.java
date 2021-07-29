import java.util.Scanner;

public class LPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(LPS(s));
    }

    public static boolean palindrome(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r = r + str.charAt(i);
        }
        if (r.equals(str)) {
            return true;
        }
        return false;
    }

    public static int LPS(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = str.substring(i, j + 1);
                if (palindrome(s) == true && max < s.length()) {
                    max = s.length();
                }
            }
        }
        return max;
    }
}
