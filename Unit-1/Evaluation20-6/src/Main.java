////import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
////        int m = scanner.nextInt();
////        char[][] a = new char[n][m];
////        for (int i = 0; i < n; i++) {
////            String s = scanner.next();
////            for (int j = 0; j < m; j++) {
////                a[i][j] = s.charAt(j);
////            }
////        }
////        int count = 0;
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < m; j++) {
////                if (a[i][j] == 's') {
////                    if (i < n - 3 && j < m - 3) {
////                        if (a[i + 1][j + 1] == 'a' && a[i + 2][j + 2] == 'b' && a[i + 3][j + 3] == 'a') {
////                            count++;
////                        }
////                    }
////                    if (j < m - 3) {
////                        if (a[i][j + 1] == 'a' && a[i][j + 2] == 'b' && a[i][j + 3] == 'a') {
////                            count++;
////                        }
////                    }
////                    if (i < n - 3) {
////                        if (a[i + 1][j] == 'a' && a[i + 2][j] == 'b' && a[i + 3][j] == 'a') {
////                            count++;
////                        }
////                    }
////                    if (i >= 4 && j < m - 3) {
////                        if (a[i - 1][j + 1] == 'a' && a[i - 2][j + 2] == 'b' && a[i - 3][j + 3] == 'a') {
////                            count++;
////                        }
////                    }
////                }
////            }
////        }
////        System.out.println(count);
////    }
////}
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        char[][] a = new char[n][m];
//        for(int i=0;i<n;i++){
//            String s = scanner.next();
//            for(int j=0;j<m;j++){
//                 a[i][j] = s.charAt(j);
//            }
//        }
//        int count = 0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(a[i][j] == 's'){
//                    if(j < m - 3){
//                        if(a[i][j+1] =='a' && a[i][j+2] =='b' && a[i][j+3]=='a'){
//                            count++;
//                        }
//                    }
//                    if(i<n-3){
//                        if(a[i+1][j]=='a' && a[i+2][j]=='b' && a[i+3][j] == 'a'){
//                            count++;
//                        }
//                    }
//                    if(i < n - 3 && j<m-3){
//                        if(a[i+1][j+1]=='a' && a[i+2][j+2]=='b' && a[i+3][j+3] == 'a'){
//                            count++;
//                        }
//                    }
//                    if(i>=3 && j <m-3){
//                        if(a[i-1][j+1]=='a' && a[i-2][j+2]=='b' && a[i-3][j+3] == 'a'){
//                            count++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                for (int j = 0; j < m; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            String str = scanner.next();
            boolean isPresent = false;
            for (int k = 0; k < str.length(); k++) {
                isPresent = false;
                int i = k % n;
                for (int j = 0; j < m; j++) {
                    if (str.charAt(k) == a[i][j]) {
                        a[i][j] = '*';
                        isPresent = true;
                        break;
                    }
                }
                if (!isPresent) {
                    System.out.println("No");
                    return;
                }
            }
            if (isPresent) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

