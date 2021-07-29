public class Pattern {
    public static void main(String[] args) {
        int n = 4;
//        for (int i = 0; i < n; i++) {
//            for (int j = n - i- 1; j < n - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k <= n; k++) {
//                if (k == i) {
//                    System.out.print("\\");
//                } else if (k == n) {
//                    System.out.print("/");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
        /*
        \      /
         \    /
          \  /
           \/
         */

//        for (int i = 0; i < n; i++) {
//            for (int j = n - i - 1; j < n - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k <= n * 2+1; k++) {
//                if (k == i || k == n+1+i) {
//                    System.out.print("\\");
//                } else if (k == n || k == (n*2)+1) {
//                    System.out.print("/");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
    /*
    \      /\      /
     \    /  \    /
      \  /    \  /
       \/      \/
     */

        for (int i = 0; i < n; i++) {
            for (int j = n - i- 1; j >0; j--) {
                System.out.print(" ");
            }
            for (int k = n-i-1; k <= n; k++) {
                if (k == n-i-1) {
                    System.out.print("/");
                } else if (k == n) {
                    System.out.print("\\");
                    break;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}