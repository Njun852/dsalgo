package leetcode;

import java.util.HashMap;

public class Week4 {
    public static String intToRoman(int num) {
        int total = num;
        StringBuilder builder = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');


        while(total > 0) {
            int x = (int)Math.log10(total);
            int place = (int)Math.pow(10, x);
            int d = total/place;

            boolean isSubtractive = d == 4|| d == 9;
            int partial = d*place;
            int nearest = getNearest(partial);
            System.out.println(nearest);
            total-=(d*place);
        }
        return "";
    }

    public static int getNearest(int target) {
        int[] nums = {1, 5, 10, 50, 100, 500, 1000};
        int low = 0;
        int high = nums.length;
        int mid = low+high/2;
        int num = nums[mid];

        while(low != high) {
            mid = (low+high)/2;
            if(num < target) {
                low = mid+1;
                int next = nums[(low+high)/2];
                if(Math.abs(target-next) > Math.abs(target-num)) {
                    break;
                }
                num = next;
            }else {
                high = mid-1;
                int next = nums[(low+high)/2];
                if(Math.abs(target-next) > Math.abs(target-num)) {
                    break;
                }
                num = next;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        intToRoman(123);
    }
}
