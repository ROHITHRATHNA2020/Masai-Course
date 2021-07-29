import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,5,6};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        int k=3;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=k){
                ans=k;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
