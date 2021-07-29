import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j+2<=m-1) {
                    if (a[i][j] + a[i][j + 1] + a[i][j + 2] == k) {
                        count++;
                    }
                }
                if(i+2<=n-1 && j+2<=m-1) {
                    if (a[i][j] + a[i + 1][j + 1] + a[i + 2][j + 2] == k) {
                        count++;
                    }
                }
                if(i+2<=n-1) {
                    if (a[i][j] + a[i + 1][j] + a[i + 2][j] == k) {
                        count++;
                    }
                }
                if(j>=2 && i+2<=n-1 ) {
                    if (a[i][j] + a[i + 1][j - 1] + a[i + 2][j - 2] == k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
