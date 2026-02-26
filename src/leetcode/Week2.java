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
        int m = 1;
        int sum = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 || j >= 0) {
            if(i >= 0) {
                sum += m*(a.charAt(i--)-48);
            }
            if(j >= 0) {
                sum += m*(b.charAt(j--)-48);
            }
            m+=m;
        }
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2};
        System.out.println(addBinary("111111010", "1"));
    }
}
