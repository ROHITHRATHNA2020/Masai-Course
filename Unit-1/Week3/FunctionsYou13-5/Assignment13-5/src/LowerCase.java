import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        while(t --> 0) {
            String word = scanner.next();
            lowerCase(word);
        }
    }
    public static void lowerCase(String word){
        char ch='a';
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i)<=90){
                ch=(char)(word.charAt(i)+32);
            }else{
                ch=word.charAt(i);
            }
            System.out.print(ch);
        }

    }
}
