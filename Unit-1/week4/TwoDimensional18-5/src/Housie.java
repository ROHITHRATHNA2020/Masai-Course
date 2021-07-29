import java.util.HashMap;
import java.util.Map;

public class Housie {
    public static void main(String[] args) {
        HashMap<String, String[]> hashMap = new HashMap<>();
        String[] topRow = {"ram", "ayush", "nrupul"};
        String[] bottomRow = {"floyd", "leo"};
        String[] middleRow = {"sita", "laxman", "jaydev", "surya"};
        hashMap.put("TopRow", topRow);
        hashMap.put("BottomRow", bottomRow);
        hashMap.put("MiddleRow", middleRow);
        for (Map.Entry<String, String[]> map : hashMap.entrySet()) {
            for (int i = 0; i < map.getValue().length; i++) {
                if (map.getKey().equals("TopRow") && map.getValue()[i].length() > 4) {
                    System.out.println(map.getValue()[i]);
                }
            }
        }
    }
}
