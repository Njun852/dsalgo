package leetcode;

import java.util.ArrayList;

public class Week2 {
    public static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            int n = nums[mid];
            if(n == target || target == nums[low] || target == nums[high]) return true;
            if(nums[low] == nums[high] && nums[low] == n) {
                high--;
                low++;
                continue;
            }
            if(n <= nums[high]) {
                if(target > n && target <= nums[high]) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
                continue;
            }
            if(target < n && target >= nums[low]) {
                high = mid-1;
                System.out.println(nums[low]);
            }else {
                low = mid+1;
            }
        }
        return false;
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            char[] res = getDigits(i >= 0 ? a.charAt(i) : '0', j >= 0 ? b.charAt(j) : '0', carry);
            i--;
            j--;
            carry = res.length > 1 ? 1 : 0;
            sb.insert(0, res[res.length - 1]);
        }
        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
    public static char[] getDigits(char a, char b, int carry) {
        String res = Integer.toBinaryString(a-48+b-48+carry);
        return res.toCharArray();
    }

    public static int superimposition(int num) {
        String digits = String.valueOf(num);
        int sum = 0;
        for(char d : digits.toCharArray()) {
            int newSum = sum+d-'0';
            if(newSum > 9) continue;
            sum = newSum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(superimposition(11111));
    }
}
