public class Quadratic {
    public static void main(String[] args) {
        int A=3;
        int B=2;
        int C=4;
        int K=36;
        int low=0;
        int high=K-C;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A*mid*mid+B*mid+C>K){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
