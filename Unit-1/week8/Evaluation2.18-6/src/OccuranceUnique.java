import java.util.Map;
import java.util.LinkedHashMap;

public class OccuranceUnique {
    public static void main(String[] args) {
        int[] a = {-3,0,1,-3,1,1,1,-3,10,0};
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        LinkedHashMap<Integer, Integer> hashMap1 = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hashMap.containsKey(a[i])) {
                int count = hashMap.get(a[i]);
                hashMap.put(a[i], ++count);
            } else {
                hashMap.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
           if(hashMap1.containsKey(map.getValue())){
               System.out.print("False");
               return;
           }else{
               hashMap1.put(map.getValue(),1);
           }
        }
        System.out.println("True");
    }
}
