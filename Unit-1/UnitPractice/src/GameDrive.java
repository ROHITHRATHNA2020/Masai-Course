//import java.util.Scanner;
//
//public class GameDrive {
//
//    static Matrix matrix = new Matrix();
//
//    static final int n = 3;
//    static  int count = 1;
//    static int[][] a = new int[n][n];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = count++;
//            }
//        }
//        System.out.println("Choose Your Position Number\n" +
//                "\n" +
//                "1  2  3\n" +
//                "4  5  6\n" +
//                "7  8  9");
//        int number = scanner.nextInt();
//        switch (number) {
//            case 1: zero();
//                break;
//            case 2: One();
//            break;
//
//
//        }
//
//    }
//
//    public static void zero() {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 && j == 0) {
//                    System.out.print("*  ");
//                }else{
//                    System.out.print(a[i][j] +"  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
