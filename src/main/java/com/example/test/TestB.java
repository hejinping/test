package com.example.test;

/**
 * @author jinping.he
 * @DESCRIPTION:
 * @DATE: 2022/8/3 5:27 PM
 */
public class TestB {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        String st = "";
        ok:
        for (int i = 0; i < s.length(); i++) {
            String str = st + "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                if (checkDifferent(str)) {
                    i = j;
                    st = str.substring(1);
                    break;
                }
                if (str.length() > max) {
                    max = str.length();
                }
                if (j == s.length()) {
                    break ok;
                }
            }
        }
        return max;
    }

    static boolean checkDifferent(String str) {
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String tmp = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(tmp));


    }
}
