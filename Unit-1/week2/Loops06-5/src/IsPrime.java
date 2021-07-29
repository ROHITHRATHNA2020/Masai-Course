import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        boolean isprime=true;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                isprime=false;
//                break;
//            }
//        }
//        if(isprime==true && (n!=1 )){
//            System.out.println("prime");
//        }else{
//            System.out.println("not prime");
//        }

//        int l = scanner.nextInt();
//        int r = scanner.nextInt();
//        for (int i = l; i <= r; i++) {
//            boolean isprime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime == true) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//        int l=scanner.nextInt();
//        int r=scanner.nextInt();
//        for(int i=l;i<=r;i++){
//            boolean isPrime=false;
//            for(int j=2;j<i;j++){
//                if(i%j==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime==true){
//                System.out.println(i);
//            }
//        }
//    }
//}


                int l=scanner.nextInt();
                int r=scanner.nextInt();
                for(int i=l;i<=r;i++){
                    boolean isPrime=true;
                    for(int j=2;j<i;j++){
                        if(i%j==0){
                            isPrime=false;
                            break;
                        }
                    }
                    if(isPrime==true && (i!=1)){
                        System.out.print(i+" ");
                    }
                }
            }
        }
