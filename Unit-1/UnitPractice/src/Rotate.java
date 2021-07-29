public class Rotate {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int k=1;
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[(a[i]+k)%n]+" ");
        }
    }
}
