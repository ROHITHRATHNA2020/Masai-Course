import java.util.Scanner;

public class plusSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < (2 * n) + 1; i++) {
            for (int j = 0; j < (2 * n) + 1; j++) {
                if (i == n || j == n) {
                    System.out.print("*");
                    if (i == n) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
