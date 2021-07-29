import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Ajay", 21345);
            hashMap.put("RamDas", 32146);
            hashMap.put("Rohith", 23522);
            hashMap.put("Nihal", 98743);
            String name = scanner.next();
            boolean found = false;
            for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
                if (map.getKey().equals(name)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println(hashMap.get(name));
            } else {
                System.out.println("No user found");
            }
        }
    }
}
/*
Ajay 21345
RamDas 32146
Rohith 23522
Nihal 98743
 */

