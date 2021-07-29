public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > n - i - 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                if (i == k) {
                    System.out.print("\\");
                } else if (k == n) {
                    System.out.print("/");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

