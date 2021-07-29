import java.util.Scanner;

public class Receipe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                int s = arr[0];
                for (int i = 0; i < n; i++) {
                    if (arr[i] < s) {
                        s = arr[i];
                    }
                }
                boolean isDivisible = true;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % s == 0) {
                        isDivisible = true;
                    } else {
                        isDivisible = false;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (isDivisible == true) {
                        System.out.print(arr[i] / s + " ");
                    } else {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}
