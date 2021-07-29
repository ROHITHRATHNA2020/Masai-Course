public class Pair {
    public static void main(String[] args) {
        int[] arr={ 1, 3 , 5 , 2 , 7};
        int k=8;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
