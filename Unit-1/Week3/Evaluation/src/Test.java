public class Test {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,6,8};
        int n=arr.length;
        int k=3;
        int low1=0;
        int low2=0;
        int high1=n-1;
        int high2=n-1;
        int UB=-1;
        int LB=-1;
        int count=0;
        while(low1<=high1){
            int mid1=low1+(high1-low1)/2;
            if(arr[mid1]>=k){
                LB=mid1;
                high1=mid1-1;
            }else{
                low1=mid1+1;
            }
        }
        while(low2<=high2){
            int mid2=low2+(high2-low2)/2;
            if(arr[mid2]<=k){
                UB=mid2;
                low2=mid2+1;
            }else{
                high2=mid2-1;
            }
        }

        count=UB-LB+1;
        System.out.println(count);
    }
}
