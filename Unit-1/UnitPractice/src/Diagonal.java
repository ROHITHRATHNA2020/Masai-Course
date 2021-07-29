import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[i][j] = scanner.nextInt();
        }
        int count = 0;
        for (int t = 0; t < 2 * n; t++) {
            if (count % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + j == count) {
                            System.out.print(a[i][j]+ " ");
                        }
                    }
                }
                count++;
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = n - 1; j >= 0; j--) {
                        if (i + j == count) {
                            System.out.print(a[j][i]+" ");
                        }
                    }
                }
                count++;
            }
        }
    }
}

