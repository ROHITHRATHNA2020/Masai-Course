import java.util.Scanner;

public class MirrorImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while(t --> 0) {
            String word = scanner.next();
            char a = 'a';
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) <= 109) {
                    a = (char) (word.charAt(i) + 25 - (word.charAt(i) - 97) * 2);
                } else {
                    a = (char) (word.charAt(i) - 25 + (122 - word.charAt(i)) * 2);
                }
                System.out.print(a);
            }
        }
    }
}
