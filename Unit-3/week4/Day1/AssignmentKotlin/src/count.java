import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str1 = scanner.nextLine();
        String str = str1.replaceAll(" ","");
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), ++count);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry <Character, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey()+"-"+map.getValue());
        }
    }
}
