import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int menu[] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512,1024, 2048};
        ;

//        for (int i = 0; i < n; i++) {
//            if (menu[i] == k) {
//                count++;
//                break;
//            } else if (menu[i] > k) {
//                k = k - menu[i - 1];
//                i=0;
//                count++;
//            } else if (menu[n - 1] < k) {
//                k = k = menu[n - 1];
//                count++;
//                i = 0;
//            }
//        }
//        System.out.println(count);
//        int count = 0;
//        System.out.println("enter the number");
//        int k = scanner.nextInt();
//        int[] menu = new int[12];
//        int n = menu.length;
//        menu[0] = 1;
//        System.out.println("enter the prices");
//        for (int i = 1; i < 12; i++) {
//            menu[i] = 2 * menu[i - 1];
//        }
//        int i = 0;
//        while (i <= n) {
//            if (menu[i] == k) {
//                count++;
//                break;
//            } else if (menu[i] > k) {
//                k = k - menu[i - 1];
//                count++;
//                i = 0;
//            } else if (menu[n - 1] < k) {
//                k = k = menu[n - 1];
//                count++;
//                i = 0;
//            } else {
//                i++;
//            }
//        }
//        System.out.println(count);
//    }
//}
        try{
            Scanner scanner= new Scanner(System.in);
            int t=scanner.nextInt();
            while(t-->0){
                int k=scanner.nextInt();
                int count=0;
                int i=0;
                int arr[] = new int[12];
                arr[0]=1;
                for( i=1;i<12;i++){
                    arr[i] = 2*arr[i-1];
                }
                int n=arr.length;
                i=0;
                while(i<=n){
                    if(arr[i]==k){
                        count++;
                        break;
                    }else if(arr[i]>k){
                        k=k-arr[i-1];
                        count++;
                        i=0;
                    }else if(arr[n-1]<k){
                        k=k-arr[n-1];
                        count++;
                        i=0;
                    }else {
                        i++;
                    }
                }
                System.out.println(count);
            }
        }
        catch(Exception e){
            return;
        }
    }
}
