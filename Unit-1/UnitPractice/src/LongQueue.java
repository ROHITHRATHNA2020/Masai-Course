import java.util.Scanner;

public class LongQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;
        int queue = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            if (a[i] < a[j]) {
                count = queue + 1;
            } else if(a[i]==a[j])  {
                queue++;
            }
        }
        System.out.println(count);
    }
}
