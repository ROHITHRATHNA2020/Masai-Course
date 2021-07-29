import java.util.*;

public class MasaiSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.next();
        LinkedHashMap<Character,Integer> hashMap= new LinkedHashMap<>();
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(hashMap.containsKey(b)){
                int count=hashMap.get(b);
                hashMap.put(b,++count);
            }else{
                hashMap.put(b,1);
            }
        }
        for(Map.Entry<Character,Integer> map: hashMap.entrySet()){
            System.out.println(map.getKey()+ " "+map.getValue());
        }
    }
}
