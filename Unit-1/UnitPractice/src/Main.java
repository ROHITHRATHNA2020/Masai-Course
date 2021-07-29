import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            char[][] a = new char[n][n];
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            boolean hSymmetric = true;
            boolean vSymmetric = true;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[n - i - 1][j]) {
                        hSymmetric = false;
                        break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    if (a[i][j] != a[i][n - j - 1]) {
                        vSymmetric = false;
                        break;
                    }
                }
            }
            if (hSymmetric && vSymmetric) {
                System.out.println("BOTH");
            } else if (hSymmetric) {
                System.out.println("HORIZONTAL");
            } else if (vSymmetric) {
                System.out.println("VERTICAL");
            } else {
                System.out.println("NO");
            }
        }
    }
}







