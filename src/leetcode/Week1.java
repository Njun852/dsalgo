package leetcode;

import java.util.*;

public class Week1 {

    public static int LengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int longest = 0;
        int j = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(chars.containsKey(c) && j <= chars.get(c)) {
                j = chars.get(c)+1;
            }
            chars.put(s.charAt(i), i);
            longest = Math.max(longest, i-j+1);
        }
        return longest;
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> combination = new ArrayList<>();
        combine(0, new StringBuilder(), combination, digits);
        return combination;
    }

    public static void combine(int index, StringBuilder sb, ArrayList<String> combination, String digits) {
        if(index >= digits.length()) {
            combination.add(sb.toString());
            return;
        }
        int digitIndex = digits.charAt(index)-'0';
        String[] allLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String letters = allLetters[digitIndex];

        for(int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            combine(index+1, sb, combination, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args){
        String s = "78";
        System.out.println(letterCombinations(s));
    }
}
