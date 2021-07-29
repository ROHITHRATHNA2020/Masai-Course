import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int n = a.length();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                count = 1;
                int start = i;
                int end = j;
                while (a.charAt(start) == a.charAt(end) && i <= j) {
                    start++;
                    end--;
                    count++;
                }
                break;
            }
        }
        System.out.println(count);
    }
}
