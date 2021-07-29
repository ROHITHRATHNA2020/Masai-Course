import java.util.*;

public class Skills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < 9; i++) {
            String a = scanner.next();
            String b = scanner.next();
            if (hashMap.containsKey(a)) {
                ArrayList<String> arrayList;
                arrayList = hashMap.get(a);
                arrayList.add(b);
                hashMap.put(a, arrayList);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(b);
                hashMap.put(a, arrayList);
            }
        }
        for (Map.Entry<String, ArrayList<String>> map : hashMap.entrySet()) {
           for(int i=0;i<map.getValue().size();i++){
               if(map.getValue().get(i).equals("ds")){
                   System.out.println(map.getKey());
               }
            }
        }

//        HashMap<String, String[]> hashMap=new HashMap<>();
//        String[] nrupulSkills={"cmd", "python", "sql"};
//        String[] PrateekSkills={"js", "html"};
//        String[] AmanSkills={"ds", "algo"};
//        String[] AlbertSkills={"js", "react"};
//        hashMap.put("nrupul",nrupulSkills);
//        hashMap.put("Prateek",PrateekSkills);
//        hashMap.put("Aman",AmanSkills);
//        hashMap.put("Albert",AlbertSkills);
//        for(Map.Entry<String, String[]> map : hashMap.entrySet()){
//            for(int i=0;i<map.getValue().length;i++){
//                if(map.getValue()[i].equals("ds")){
//                    System.out.println(map.getKey());
//                }
//            }
//        }
    }
}


