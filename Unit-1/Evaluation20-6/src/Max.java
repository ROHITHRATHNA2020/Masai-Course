import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(max(str));

    }

    public static int max(String str) {
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = "";
                for (int k = i; k <= j; k++) {
                    s = s + str.charAt(k);
                }
                boolean isEqual = true;
                for (int t = 0; t < s.length(); t++) {
                    if (s.charAt(0) != s.charAt(t)) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    if (max < s.length()) {
                        max = s.length();
                    }
                }
            }
        }
        return max;
    }
}



//                boolean isEqual = true;
//                for (int t = 1; t < s.length(); t++) {
//                    if (s.charAt(0) != s.charAt(t)) {
//                        isEqual = false;
//                        break;
//                    }
//                    if (isEqual) {
//                        if (max < s.length()) {
//                            max = s.length();
//                        }
//                    }
//                }
//            }
////        }
//        return max;


//        int max = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                } else {
//                    i = j;
//                    break;
//                }
//            }
//            if (max < count) {
//                max = count;
//            }
//
//        }
//        return max;
//    }
//}
