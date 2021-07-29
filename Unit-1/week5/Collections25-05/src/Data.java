import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap< String ,Integer> hashMap = new HashMap<>();
        int s= scanner.nextInt();
        for(int i=0;i<s;i++){
            hashMap.put(scanner.next(), scanner.nextInt() );
        }
        for(Map.Entry<String,Integer> map:hashMap.entrySet()){
            if(map.getValue()>30){
                System.out.println(map.getKey());
            }
        }
    }
}
