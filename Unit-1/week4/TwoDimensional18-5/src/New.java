import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int K = scanner.nextInt();

            String[] word = new String[n];
            for (int i = 0; i < word.length; i++) {
                word[i] = scanner.next();
            }
            while (K-- > 0) {
                boolean isPresent = false;
                int l = scanner.nextInt();
                String[] dict1 = new String[l];
                for (int k = 0; k < l; k++) {
                    dict1[k] = scanner.next();
                }
                for (int i = 0; i < word.length; i++) {
                    for (int j = 0; j < dict1.length; j++) {
                        if (word[i].equals(dict1[j])) {
                            isPresent = true;
                            break;
                        }
                    }
                }
                if (isPresent == true) {
                    System.out.println("Yes" );
                } else {
                    System.out.println("No");
                }
            }

        }
    }
}


