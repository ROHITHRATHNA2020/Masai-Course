import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            if (hashMap.containsKey(a)) {
                int c = hashMap.get(str1.charAt(i));
                hashMap.put(str1.charAt(i), ++c);
            } else {
                hashMap.put(str1.charAt(i), 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char a = str2.charAt(i);
            if (hashMap.containsKey(a)) {
                int c = hashMap.get(str2.charAt(i));
                hashMap.put(a, --c);
            } else {
                System.out.println("False");
                return;
            }
        }

        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if (map.getValue() != 0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
