import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String name = "police";
        String name1 = "poceli";
//        int n=name.length();
//        int l=name1.length();
//        if(n!=l){
//            System.out.println("No");
//        }else {
//            for (int i = 0; i < name.length(); i++) {
//                for (int j = 0; j < name1.length(); j++) {
//                    if (name.charAt(i) == name1.charAt(j)) {
//
//                    }
//                }
//            }
//        }
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> hashMap1 = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            if (hashMap.containsKey(name.charAt(i))) {
                int count = 1;
                hashMap.put(name.charAt(i), count + 1);
            } else {
                hashMap.put(name.charAt(i), 1);
            }
        }
        for (int i = 0; i < name1.length(); i++) {
            if (hashMap1.containsKey(name1.charAt(i))) {
                int count = 1;
                hashMap1.put(name1.charAt(i), count + 1);
            } else {
                hashMap1.put(name1.charAt(i), 1);
            }
        }
        boolean isPresent = false;
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
            for (Map.Entry<Character, Integer> map1 : hashMap1.entrySet()) {
                System.out.println(map1.getKey()+" "+map1.getValue());
                if (map.getKey() == map1.getKey() && map.getValue() == map1.getValue()) {
                    isPresent = true;
                } else {
                    isPresent = false;
                    break;
                }
            }
        }
        if (isPresent == true) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
