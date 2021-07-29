//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr={1,2,5,6,7,8,12};
//        int n=arr.length;
//        int ans=0;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                    ans=(j-i);
//            }
//        }
//        System.out.println(sum);
//    }
//    public static boolean isPrime(int n){
//        boolean prime=true;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                prime=false;
//                break;
//            }
//        }
//        if(prime==true){
//            return true;
//        }
//        return false;
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    arr2[i][j] = arr2[i][j] + arr1[i][j];
                }
            }
        } else {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}




