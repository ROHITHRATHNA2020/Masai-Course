public class RemoveEven {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        removeEven(arr);

    }
    public static void removeEven(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
