public class UpperToLower {
    public static void main(String[] args) {
        String word="ROHITH";
        upperToLOwer(word);

    }
    public static void upperToLOwer(String word){
        String lowercase="";
        for(int i=0;i<word.length();i++){
            char ch=(char)(word.charAt(i)+32);
            lowercase=lowercase+ch;
        }
        System.out.println(lowercase);
    }
}
