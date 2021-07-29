import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            for (int i = n-1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[i][j] >= arr[i][j + 1]) {
                        arr[i - 1][j] = arr[i - 1][j] + arr[i][j];
                    } else {
                        arr[i - 1][j] = arr[i - 1][j] + arr[i][j + 1];
                    }
                }

            }
            System.out.println(arr[0][0]);

        }
    }
}

