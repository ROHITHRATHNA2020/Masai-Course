import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String[] names={"masai","School"};
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length();j++){
                char c=names[i].charAt(j);
              if(hashMap.containsKey(c)){
                    int count=1;
                  hashMap.put(c,count+1);
              }else{
                  hashMap.put(c,1);
              }
            }
        }
        for(Map.Entry<Character,Integer> map:hashMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

    }
}
