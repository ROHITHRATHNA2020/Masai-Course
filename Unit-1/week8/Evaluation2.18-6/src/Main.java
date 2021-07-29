import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            int leftcount = 0;
            int rightcount = 0;
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        if (leftSum <= a[i][j]) {
                            if (leftSum == a[i][j]) {
                                leftcount++;
                            }
                        } else if (leftSum < a[i][j]) {
                            leftcount = 1;
                            leftSum = a[i][j];
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n - i - 1) {
                        if (rightSum == a[i][j]) {
                            if (rightSum == a[i][j]) {
                                rightcount++;
                            }
                        } else if (rightSum < a[i][j]) {
                            rightcount = 1;
                            rightSum = a[i][j];
                        }
                    }
                }
            }
            if (leftSum > rightSum) {
                if (leftcount % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else {
                if (rightcount % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}



//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int[][] a = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                String s = scanner.next();
//                for (int j = 0; j < n; j++) {
//                    a[i][j] = s.charAt(j);
//                }
//            }
//            int starCount = 0;
//            int plusCount = 0;
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (j != n - i - 1) {
//                        if (a[i][j] == '*') {
//                            starCount++;
//                        } else if (a[i][j] == '+') {
//                            plusCount++;
//                        }
//                    }
//                }
//            }
//            if(starCount == plusCount){
//                System.out.println(Math.abs(starCount-plusCount));
//            }else{
//                System.out.println("-1");
//            }
//        }
//    }
//}


//
//public class Main {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        int t = scanner.nextInt();
////        while (t-- > 0) {
////            int n = scanner.nextInt();
//            int[][] a = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    a[i][j] = scanner.nextInt();
//                }
//            }
//            int leftSum = 0;
//            int rightSum = 0;
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (i == j) {
//                        if (leftSum < a[i][j]) {
//                            leftSum = a[i][j];
//                        }
//                    }
//                }
//            }
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (j == n - i - 1) {
//                        if (rightSum < a[i][j]) {
//                            rightSum = a[i][j];
//                        }
//                    }
//                }
//            }
//            if (Math.max(leftSum, rightSum) % 2 == 0) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
//    }
//}
























        /*
        import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            int count=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((a[i]+a[j])%2==1){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

         */
