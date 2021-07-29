import java.util.HashMap;
import java.util.Map;

public class Cake {
    public static void main(String[] args) {
        String str="acab";
        HashMap<Character,Integer> hashMap= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hashMap.containsKey(c)){
                int count=1;
                hashMap.put(c,count+1);
            }else{
                hashMap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> map: hashMap.entrySet()){

        }
    }
}
