import java.util.Scanner;

public class Forgot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            while (k-- > 0) {
                int p = scanner.nextInt();
                String[][] dict = new String[p][p];
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < p; j++) {
                        dict[i][j] = scanner.next();
                    }
                }
                for (int i = 0; i < arr[i].length(); i++) {
                    for (int j = 0; j <dict[i].length; j++) {
                        for (k = 0; k < dict[i][j].length(); k++) {
                            if(arr[i]==dict[k][j]){
                                System.out.println(arr[i]);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
