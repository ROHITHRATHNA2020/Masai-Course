import java.util.HashMap;
import java.util.Map;

public class Cricket {
    public static void main(String[] args) {
        HashMap<String, String[]> hashMap = new HashMap<>();
        String[] viratSkills={"batsman","bowler"};
        String[] dhoniSkills={"batsman","wicketKeeper"};
        String[] abdSkills={"batsman","allrounder"};
        hashMap.put("Virat",viratSkills);
        hashMap.put("Dhoni",dhoniSkills);
        hashMap.put("Abd",abdSkills);
        for(Map.Entry<String,String[]> map:hashMap.entrySet()){
            for(int i=0;i<map.getValue().length;i++){
                if(map.getValue()[i].equals("allrounder")){
                    System.out.println(map.getKey());
                }
            }
        }
    }
}
