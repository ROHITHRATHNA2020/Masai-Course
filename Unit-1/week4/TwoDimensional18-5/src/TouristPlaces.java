import java.util.ArrayList;

public class TouristPlaces {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Wayanad");
        arrayList.add("Ooty");
        arrayList.add("pondicherry");
        arrayList.add("Goa");
        arrayList.add("Munnar");
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length()>=5){
                System.out.println(arrayList.get(i));
            }
        }
    }
}

