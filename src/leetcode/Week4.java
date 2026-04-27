package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Week4 {
    public static String intToRoman(int num) {
        int total = num;
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < values.length; i++) {
            while(total >= values[i]) {
                builder.append(symbols[i]);
                total-=values[i];
            }
        }
        return builder.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        if(strs.length == 1) return strs[0];
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i > strs[j].length()-1) return builder.toString();
                if(strs[j].charAt(i) != c) {
                    return builder.toString();
                }
            }
            builder.append(c);
        }

        return builder.toString();
    }

    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length()-1; i++) {
            int[] r = new int[2];
            if(i%2 == 0 && s.charAt(i-1) == s.charAt(i)) {
                r = range(s, i - 1,  i);
            }else if(s.charAt(i-1) == s.charAt(i+1)){
                r = range(s, i - 1, i + 1);
            }
            if(r[0]+r[1] > sb.length()) {
                sb.delete(0, sb.length());
                sb.append(s, r[0], r[1]+1);
            }
        }
        return sb.toString();
    }


    public static int[] range(String s, int i, int j) {
        int[] r = {i, j};
        while(s.charAt(r[0]) == s.charAt(r[1])) {
            if(r[0]-1 < 0 || r[1]+1 > s.length()-1) break;
            if(s.charAt(r[0]) == s.charAt(r[1])) {
                r[0]--;
                r[1]++;
            }
        }
        System.out.println(r[1]);
        return r;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }


}
