import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[][] a= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= scanner.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

//        int[][] a = {{1, 8, 9},
//                {2, 7, 10},
//                {3, 6, 11},
//                {4, 5, 12}
//        };
//        int n=a.length;

//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[j][i]+" ");
//            }
//            System.out.println();
//        }
    }
}




/*
1 8 9
2 7 10
3 6 11
4 5 12
 */