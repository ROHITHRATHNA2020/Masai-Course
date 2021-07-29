import java.util.HashMap;
import java.util.Map;
public class Student {
    public static void main(String[] args) {
        HashMap<String, int[]> hashMap = new HashMap<>();
        int[] mukesh = {20, 30, 40, 50};
        int[] gourav = {30, 40, 50, 60};
        int[] ram = {10, 20, 30, 40};
        int[] arbeena = {30, 40, 60, 70};
        hashMap.put("Mukesh", mukesh);
        hashMap.put("Gourav", gourav);
        hashMap.put("Ram", ram);
        hashMap.put("Arbeena", arbeena);

        int minMarks = 200;             // highestMarks or maximum marks
        String name="";
        for (Map.Entry<String, int[]> map : hashMap.entrySet()) {
            int sum = 0;
            for (int i = 0; i < map.getValue().length; i++) {
                sum = sum + map.getValue()[i];
            }
            if (sum < minMarks) {
               name = map.getKey();
                minMarks = sum;
            }
        }
        System.out.println("The least average in the class is achieved by "+name);
        System.out.println("The least average is " + minMarks / 4);  // total Number of Subjects
    }
}


/*
 int[][] marks ={
                {20, 30, 40, 50},
                {30, 40, 50, 60},
                { 10,20,30,40},
                {30,40,60,70}


                for(int i=0;i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++) {
                hashMap.put(name[i],marks[i][j]);
            }
        }
 */