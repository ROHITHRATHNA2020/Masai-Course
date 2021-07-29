import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int count = 0;
            while (n > 0) {
                for (int i = 0; i < n; i++) {
                    if (a[i] == n) {
                        n = n - a[i];
                        count = count + 1;
                        break;
                    } else if (a[i] > n) {
                        n = n - a[i - 1];
                        count++;
                        break;
                    } else if(a[a.length-1]<n){
                        n = n - a[a.length - 1];
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
