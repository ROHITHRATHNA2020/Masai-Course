import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String str1= scanner.nextLine();
     String str2=scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<str1.length();i++) {
            char a = str1.charAt(i);
            if (a != ' ') {
                if (hashMap.containsKey(a)) {
                    int count=hashMap.get(a);
                    hashMap.put(a,++count);
                } else {
                    hashMap.put(a, 1);
                }
            }
        }
        for(int i=0;i<str2.length();i++){
            char b=str2.charAt(i);
            if(b!=' '){
                if(hashMap.containsKey(b)){
                    int count=hashMap.get(b);
                    hashMap.put(b,--count);
                }else{
                    System.out.println("False");
                    return;
                }
            }
        }
        for(Map.Entry<Character,Integer> map:hashMap.entrySet()){
            if(map.getValue()!=0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
