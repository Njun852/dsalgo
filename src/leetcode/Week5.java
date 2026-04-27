package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Week5 {
//    public static boolean isValid(String s) {
//        ArrayList<Character> stack = new ArrayList<>();
//        HashMap<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//        stack.add(s.charAt(0));
//
//        for(int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//            System.out.println(c);
//            if(map.containsKey(c)) {
//                if(stack.isEmpty() || stack.getLast() != map.get(c)) return false;
//                stack.removeLast();
//                continue;
//            }
//            stack.add(c);
//        }
//        return stack.isEmpty();
//    }

    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        return isValid(0, ' ', s.toCharArray()) > 0;
    }

    public static int isValid(int i, char last, char[] s) {
        if(i == s.length) return i;
        if(i > s.length) return -1;
        if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
            int next = isValid(i+1, s[i], s);
            return next < 0 ? -1 : isValid(next+1, last, s);
        }
        if(last == '(' && s[i] == ')' || last == '[' && s[i] == ']' || last == '{' && s[i] == '}') {
            return i;
        }
        return -1;
    }

    public static void main() {
        System.out.println(isValid("()"));
    }
}
