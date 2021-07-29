import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            String a = scanner.next();
            int n = a.length();
            if (n % 2 == 0) {
                int sum = n / 2;
                for (int i = 0; i < n - 1; i++) {
                    int count = 1;
                    for (int j = i + 1; j < n; j++) {
                        if (a.charAt(i) == a.charAt(j)) {
                            count++;
                            }
                        }
                    if (count >= sum) {
                        System.out.println("YES");
                        break;
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
