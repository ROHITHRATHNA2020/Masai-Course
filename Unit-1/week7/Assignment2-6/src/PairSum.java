import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int[] a={1,-1,1,-1,1};
        int k=1;
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(hashMap.containsKey(k-a[i])){
                 count=count+hashMap.get(k-a[i]);
            }

            if(hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i]+1));
            }else{
                hashMap.put(a[i],1);
            }
        }
        System.out.println(count);
    }
}
