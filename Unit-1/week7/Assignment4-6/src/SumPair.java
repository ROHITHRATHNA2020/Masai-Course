import java.util.HashMap;
import java.util.Scanner;

public class SumPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        int count=0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(k-arr[i])){
                count+=hashMap.get(k-arr[i]);
            }
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(count);
    }
}
