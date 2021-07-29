import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArrayItems {
    public static void main(String[] args) {
        int count = 0;
        LinkedHashMap<String, String[]> hashMap = new LinkedHashMap<>();
        String[] type = {"phone", "computer", "phone"};
        String[] color = {"blue", "silver", "gold"};
        String[] name = {"pixel", "lenovo", "iphone"};
        hashMap.put("type", type);
        hashMap.put("color", color);
        hashMap.put("name", name);
        for (Map.Entry<String, String[]> map : hashMap.entrySet()) {
            for (int i = 0; i < map.getValue().length; i++) {
                if (map.getKey().equals("type") && map.getValue()[i].equals("phone")) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

//    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count=0;
//        LinkedHashMap<String, String[]> hashMap = new LinkedHashMap<>();
//        String[] type = {"phone", "computer", "phone"};
//        String[] color = {"blue", "silver", "gold"};
//        String[] name = {"pixel", "lenovo", "iphone"};
//        hashMap.put("type", type);
//        hashMap.put("color",color);
//        hashMap.put("name",name);
//        for(Map.Entry<String,String[] > map:hashMap.entrySet()){
//            for(int i=0;i<map.getValue().length;i++){
//                if(map.getKey().equals(ruleKey) && map.getValue().equals(ruleValue)){
//                    count++;
//                }
//            }
//        }
//        return count;
}

