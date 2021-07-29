import java.util.Scanner;

public class SixNumbers {
    public static void main(String[] args) {
        int[] arr = {5,7,10};
        int n = arr.length;
        int count=0;
        try {
            for (int a = 0; a < n; a++) {
                for (int b = a + 1 % n; b < n; b++) {
                    for (int c = b + 1 % n; c < n; c++) {
                        if (((a * b + c) / a) - b == c) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }catch (Exception e){
            return;
        }
    }
}
