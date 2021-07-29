import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], ++count);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            System.out.print(map.getKey()+" ");
        }
    }
}
