import java.util.Scanner;
import java.util.Set;

public class Target {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        while(t -->0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == k) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
