import java.util.HashMap;
import java.util.Map;

public class IntegerCount {
    public static void main(String[] args) {
        int[] a={10,20,30,10,40,-30,60,60};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hashMap.containsKey(a[i])){
                int count=hashMap.get(a[i]);
                hashMap.put(a[i],count+1 );
            }else{
                hashMap.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map:hashMap.entrySet()){
            if(map.getValue()==2){
                System.out.println(map.getKey());
            }
        }
    }
}
