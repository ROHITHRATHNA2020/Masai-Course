import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                for (int j = 0; j < m; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            String str = scanner.next();
            boolean isPresent = false;
            for (int k = 0; k < str.length(); k++) {
                isPresent = false;
                int i = k % n;
                for (int j = 0; j < m; j++) {
                    if (str.charAt(k) == a[i][j]) {
                        a[i][j] = '*';
                        isPresent = true;
                        break;
                    }
                }
                if (!isPresent) {
                    System.out.println("No");
                    return;
                }
            }
            if (isPresent) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

