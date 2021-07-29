import java.util.Scanner;

public class Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==n-1 || j==n-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        char a = '*';
        char b = ' ';
        for (int i = 0; i < ((2 * n) + 1); i++) {
            for (int j = 0; j < ((2 * n) + 1); j++) {
                if (i == n || j == n) {
                    System.out.print(a);
                    if (i != (

                            )) {
                        break;
                    } else {
                        continue;
                    }
                } else {
                    System.out.print(b);
                }


            }
            System.out.println();
        }
    }
}




/*
 *
 *
 *****
 *
 *
 */




