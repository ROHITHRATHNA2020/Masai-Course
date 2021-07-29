public class UpperToLower {
    public static char UpperToLower(char a){
      char  b=(char)(a+32);
      return b;
    }
    public static void main(String[] args) {
        char a='Z';
        System.out.println(UpperToLower(a));

    }
}
