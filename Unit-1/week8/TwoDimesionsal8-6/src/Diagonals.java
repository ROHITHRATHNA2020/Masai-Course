import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == k) {
                    int start = i;
                    int end = j;
                    while (i > 0 && j > 0) {
                        i--;
                        j--;
                    }
                    while (i < n && j < m) {
                        System.out.print(a[i][j] + " ");
                        i++;
                        j++;
                    }
                    System.out.println();
                    while (start > 0 && end < m - 1) {
                        start--;
                        end++;
                    }
                    while (start < n && end >= 0) {
                        System.out.print(a[start][end] + " ");
                        start++;
                        end--;
                    }
                    break;
                }
            }
        }
    }
}

