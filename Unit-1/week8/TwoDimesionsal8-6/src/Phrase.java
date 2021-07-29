import java.util.Scanner;

public class Phrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] a = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 0; j < m; j++) {
                char[] c = s.toCharArray();
                a[i][j] = c[j];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 3 <= n - 1 && j + 3 <= m - 1) {
                    if (a[i][j] == 's' && a[i + 1][j + 1] == 'a' && a[i + 2][j + 2] == 'b' && a[i + 3][j + 3] == 'a') {
                        count++;
                    }
                }
                if (j + 3 <= m - 1) {
                    if (a[i][j] == 's' && a[i][j + 1] == 'a' && a[i][j + 2] == 'b' && a[i][j + 3] == 'a') {
                        count++;
                    }
                }
                if (i + 3 <= n - 1) {
                    if (a[i][j] == 's' && a[i + 1][j] == 'a' && a[i + 2][j] == 'b' && a[i + 3][j] == 'a') {
                        count++;
                    }
                }
                if (i >=3 && j + 3 <= m - 1) {
                    if (a[i][j] == 's' && a[i - 1][j + 1] == 'a' && a[i - 2][j + 2] == 'b' && a[i - 3][j + 3] == 'a') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}


/*
5 5
s a f e r
a m ja a d
b a b o l
a a r o n
s o n g s
 */