import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean isBehave = true;
            for (int i = 0; i < n-2; i++) {
                if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1){
                    isBehave=false;
                    break;
                }
            }
            if (isBehave == true) {
                System.out.println("Behave!");
            } else {
                System.out.println("Misbehave!");
            }
        }
    }
}


