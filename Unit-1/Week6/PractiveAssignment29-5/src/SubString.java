public class SubString {
    public static void main(String[] args) {
        String str = "thisisracecarsittingontree";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String s = str.substring(i, j + 1);
                if (palindrome(s) == true) {
                    System.out.println(s);
                }
            }
        }
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
//        int n = str.length();
//        if (n % 2 == 1) {
//            int i = 0;
//            int mid = n / 2;
//            int start = mid - 1;
//            int end = mid + 1;
//            while (i < mid) {
//                if (str.charAt(start) != str.charAt(end)) {
//                    return false;
//                } else {
//                    i++;
//                    start--;
//                    end++;
//                }
//            }
//            return true;
//        } else {
//            int mid1 = (n / 2) - 1;
//            int mid2 = n / 2;
//            int i = 0;
//            while (i <= mid1) {
//                if (str.charAt(mid1) != str.charAt(mid2)) {
//                    return false;
//                } else {
//                    mid1--;
//                    mid2++;
//                }
//            }
//            return true;
//        }


