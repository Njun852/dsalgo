package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Week3 {

    public static boolean isPalindrome(int x) {
        char[] s = String.valueOf(x).toCharArray();

        for(int i = 0; i < s.length; i++) {
            if(s[i] != s[s.length-1-i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] missingOut(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);

        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                missing.add(i);
            }
        }
        return Arrays.stream(missing.toArray()).mapToInt(e->(int)e).toArray();
    }

    public static void vowelExtractor(int n, String str) {
        StringBuilder vowels = new StringBuilder();
        String vowelList = "aeiouAEIOU";
        char[] chars = str.toCharArray();

        boolean hasVowel = false;
        for(char c : chars) {
            if(vowelList.indexOf(c) >= 0) {
                hasVowel = true;
                break;
            }
        }
        if(!hasVowel) {
            return;
        }
        int i = 0;
        while(vowels.length() < n) {
            char c = chars[i%chars.length];
            if(vowelList.indexOf(c) >= 0) {
                vowels.append(c);
            }
            i++;
        }
        System.out.println(vowels.toString());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.print("Missing numbers: ");
        for(int num : missingOut(nums)) {
            System.out.print(num+" ");
        }

    }
}
