import java.util.LinkedHashSet;

public class Repeated {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Masai");
        hashSet.add("School");
        hashSet.add("is");
        hashSet.add("Awesome");
        hashSet.add("but");
        hashSet.add("Masai");
        hashSet.add("is");
        hashSet.add("intense");
        System.out.println(hashSet);

    }
}

/*
["Masai","School","is","Awesome","but","Masai","is","intense"]

 */