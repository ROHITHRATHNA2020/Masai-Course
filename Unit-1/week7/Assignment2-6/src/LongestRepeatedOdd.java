import java.util.Scanner;

public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 == 1 && arr[j] == arr[i]) {
                        count++;
                    } else {
                        i = j;
                        break;
                    }
                }
                if (max < count) {
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
    