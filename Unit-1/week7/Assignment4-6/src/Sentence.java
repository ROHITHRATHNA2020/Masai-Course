import java.util.*;

public class Sentence {
    public static void main(String[] args) {
        String str = "Myself2 Me1 I4 and3"; //is2 sentence4 This1 a3  Myself2 Me1 I4 and3
        HashMap<Integer, String> hashMap = new HashMap<>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (hashMap.containsKey(s[i])) {

            } else {
                hashMap.put(Integer.parseInt(String.valueOf(s[i].charAt(s[i].length() - 1))), s[i].substring(0, s[i].length() - 1));
            }
        }
        hashMap.forEach((k,v)-> System.out.print(v+" "));
    }
}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//        for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
//            System.out.print(map.getValue() + " ");
//        }


//        String[] s = str.split(" ");
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(Integer.parseInt(String.valueOf(s[i].charAt(s[i].length() - 1))));
//            System.out.println(s[i].substring(0, s[i].length() - 1));
//        }

//
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(2, "is");
//        hashMap.put(4, "sentence");
//        hashMap.put(1, "This");
//        hashMap.put(3, "a");
//        hashMap.forEach((k,v)-> System.out.print(v+" "));
//        Collections.sort(hashMap<Integer,String> );




