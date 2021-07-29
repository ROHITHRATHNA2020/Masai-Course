import java.util.Scanner;

public class array {

    public static int count(int arr[][], int n, int m, int sum) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j < m - 2) {
                    if (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] == sum) {
                        count++;
                    }
                }
                if (i < n - 2) {
                    if (arr[i][j] + arr[i + 1][j] + arr[i + 2][j] == sum) {
                        count++;
                    }
                }
                if (j < m - 2 && i < n - 2) {
                    if (arr[i][j] + arr[i + 1][j + 1] + arr[i + 2][j + 2] == sum) {
                        count++;
                    }
                }
                if (i > n - 2 && j < m - 2) {
                    if (arr[i][j] + arr[i - 1][j + 1] + arr[i - 2][j + 2] == sum) {
                        count++;
                    }
                }
            }
        }
        return count;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(count(arr, n, m, sum));

    }
}
