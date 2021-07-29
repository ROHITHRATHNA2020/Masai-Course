import java.util.HashMap;

public class Collections{
    public static void main(String[] args){
        HashMap<String, String[]> hashMap= new HashMap<>();
        String[] toprow={"ram","ayush","nrupul"};
        String[] middlerow={"sita","laxman","jaydev","surya"};
        String[] bottomrow={"floyd","leo"};
        hashMap.put("toprow",toprow);
        hashMap.put("middlerow",middlerow);
        hashMap.put("bottomrow",bottomrow);
        for(int i=0;i< toprow.length;i++){
            if(toprow[i].length()>4){
                System.out.println(toprow[i]);
            }
        }
    }
}