import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n=scanner.nextInt();
            String s = scanner.next();
            String v = "";
            String c = "";
            for (int i = 0; i < n; i++) {
                if (s.charAt(i)=='a' ||s.charAt(i)=='A' ||
                        s.charAt(i)=='e' ||s.charAt(i)=='E' ||
                        s.charAt(i)=='i' ||s.charAt(i)=='I' ||
                        s.charAt(i)=='o' ||s.charAt(i)=='O' ||
                        s.charAt(i)=='u' ||s.charAt(i)=='U' ) {
                    v = v + s.charAt(i);
                } else {
                    c = c + s.charAt(i);
                }
            }
            System.out.println(v + c);
        }
    }
}
    