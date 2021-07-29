public class RemoveConsonants {


    public static void main(String[] args) {
        String name = "Rohith";
        removeConsonants(name);
    }

    public static void removeConsonants(String name) {
        String out = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A' ||
                    name.charAt(i) == 'e' || name.charAt(i) == 'E' ||
                    name.charAt(i) == 'i' || name.charAt(i) == 'I' ||
                    name.charAt(i) == 'o' || name.charAt(i) == 'O' ||
                    name.charAt(i) == 'u' || name.charAt(i) == 'U' ){
                out = out + name.charAt(i);
            }else {
                continue;
            }
        }
        System.out.println(out);
    }
}
