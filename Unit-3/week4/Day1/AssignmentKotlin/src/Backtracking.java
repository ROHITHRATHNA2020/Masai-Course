import java.util.Scanner;

public class Backtracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int l =0;
        int r = str.length()-1;
        permute(str, l, r);

    }

    private static String permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, str.charAt(l), str.charAt(i));
                return permute(str, l + 1, r);
            }
        }
        return "1";
    }

    private static String swap(String str, char l, char i) {
        char temp;
        temp = l;
        l = i;
        i = temp;
        return str;
    }
}
