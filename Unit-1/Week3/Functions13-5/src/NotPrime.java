public class NotPrime {
    public static void isNotPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==false && n==1){
            System.out.println("Not a prime");
        }else{
            System.out.println("Prime");
        }
    }

    public static void main(String[] args) {
        isNotPrime(11);
    }
}
