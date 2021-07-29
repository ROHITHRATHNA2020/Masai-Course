import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int t = j - i;
                if(i<j && prime(t)){
                    if(a[i]>a[j]){
                        sum=sum+a[i]-a[j];
                    }else{
                        sum=sum+a[j]-a[i];
                    }
                }
            }
        }
        System.out.println(sum);
    }


    public static boolean prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true && n != 1) {
            return true;
        }
        return false;
    }
}

