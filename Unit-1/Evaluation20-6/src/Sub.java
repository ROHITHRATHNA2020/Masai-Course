import java.util.Scanner;
public class Sub{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        if(n==1 ) {
            if (a[0] == 0) {
                System.out.println("YES");
                return;
            } else {
                System.out.println("NO");
                return;
            }
        }
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]) {
                a[i + 1] = a[i + 1] - a[i];
                a[i]=0;
            }else if(a[i]==a[i+1]){
                a[i+1]=0;
                a[i]=0;
            }else{
                System.out.println("No");
                return;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}


//        if(n==1 ) {
//            if (a[0] == 0) {
//                System.out.println("YES");
//                return;
//            } else {
//                System.out.println("NO");
//                return;
//            }
//        }
//        int count=0;
//        boolean isDivisible = true;
//        for(int i=0;i<n;i++){
//            int j=i+1;
//            if(a[i] != a[j]){
//                isDivisible = false;
//                break;
//            }else if(a[i]==0){
//                i=i+1;
//                count++;
//            }else{
//                i=i+2;
//            }
//        }
//        if(isDivisible){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }