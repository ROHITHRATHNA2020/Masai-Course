import java.util.Collection;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        System.out.println(hashMap);
        Collection <Integer> key = hashMap.keySet();
        for (Integer string : key) {
            System.out.println(string);
        }

    }
}
