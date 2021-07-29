import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        String[][] a = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < n; i++) {
            int j = 0;
            if (a[i][j].equals(a[i][j + 1]) && a[i][j].equals(a[i][j + 2])) {
                System.out.println(a[i][j]);
                return;
            }
            if (a[j][i].equals(a[j + 1][i]) && a[j][i].equals(a[j + 2][i])) {
                System.out.println(a[j][i]);
                return;
            }
        }
        for (int t = 0; t < 1; t++) {
            int i = 0;
            int j = 0;
            if (a[i][j].equals(a[i + 1][j + 1]) && a[i][j].equals(a[i + 2][j + 2])) {
                System.out.println(a[i][j]);
                break;
            }
            if (a[i][j + 2].equals(a[i + 1][j + 1]) && a[i][j + 2].equals(a[i + 2][j])) {
                System.out.println(a[i][j + 2]);
                break;
            } else {
                System.out.println("Tie");
            }
        }
    }
}

