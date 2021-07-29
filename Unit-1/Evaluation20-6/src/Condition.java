import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        int count = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    for (int d = 0; d < n; d++) {
                        for (int e = 0; e < n; e++) {
                            for (int f = 0; f < n; f++) {
                                double k = (arr[a] * arr[b] + arr[c]) / arr[d];
                                if (k - arr[e] == arr[f]) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}




