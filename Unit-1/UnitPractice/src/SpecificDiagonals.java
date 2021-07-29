import java.util.Scanner;

public class SpecificDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
//        int[][] a = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = scanner.nextInt();
//            }
//        }
        char[][] a= new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.next().charAt(0);
            }
        }
        int dif = 0;
        int sum = 0;
        int k = scanner.next().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == k) {
                    dif = i - j;
                    sum = i + j;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i - j == dif) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == sum) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}


//     Method of Increment and decrementing the indexes
//        int k = scanner.nextInt();
//        int LStart = 0;
//        int RStart = 0;
//        int LEnd = 0;
//        int REnd = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i][j] == k) {
//                    LStart = i;
//                    RStart = i;
//                    LEnd = j;
//                    REnd = j;
//                    break;
//                }
//            }
//        }
//        while (LStart > 0 && LEnd > 0) {
//            LStart--;
//            LEnd--;
//        }
//        while (LStart < n && LEnd < n) {
//            System.out.print(a[LStart][LEnd] + " ");
//            LStart++;
//            LEnd++;
//        }
//        System.out.println();
//        while (RStart > 0 && REnd < m-1) {
//            RStart--;
//            REnd++;
//        }
//        while (RStart <= n - 1 && REnd >= 0) {
//            System.out.print(a[RStart][REnd] + " ");
//            RStart++;
//            REnd--;
//        }
//    }
//}

