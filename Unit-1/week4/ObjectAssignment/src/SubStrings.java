import java.util.Arrays;

import static java.util.Arrays.sort;

public class SubStrings {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nag a rams";
        String s1 = "";
        String s2 = "";
        boolean isAnagram = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                s1 = s1 + str1.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                s2 = s2 + str2.charAt(i);
            }
        }
        char[] s3=s1.toCharArray();
        Arrays.sort(s3);
        System.out.println(new String(s3));
        char[] s4=s2.toCharArray();
        Arrays.sort(s4);
        System.out.println(s4);

        if (s3.length == s4.length) {
            for (int i = 0; i < s3.length; i++) {
                if (s3[i] != s4[i]) {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }
        if (isAnagram == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println("not Anagrams");
        }
    }
}