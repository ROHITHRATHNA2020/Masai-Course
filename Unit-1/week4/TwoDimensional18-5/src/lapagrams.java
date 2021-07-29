import java.util.Scanner;

public class lapagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b = scanner.nextLine();
        String c=a.replaceAll(" ","");
        String d = b.replaceAll(" ","");
        int x = c.length();
        int y = d.length();
        if(x!=y){
            System.out.println("False");
            return;
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (c.charAt(i) == d.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (d.charAt(i) == c.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == x + y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
