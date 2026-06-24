package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Week7 {
    public static String convert(String s, int numRows) {
        boolean isDown = true;
        StringBuilder sb = new StringBuilder();
        int visits = 0;
        int i = 0;
        int j = 0;
        sb.append(s.charAt(0));
        while (visits < s.length()) {
            int k = numRows-i-1;
            int k1 = i;
            int steps = isDown && i != numRows-1 || i == 0 ? Math.max(0, 2*k-1) : Math.max(0, 2*k1-1);

            j += steps+1;
            if(j >= s.length()) {
                i++;
                j = i;
                visits++;
                if(visits < s.length()){
                    sb.append(s.charAt(i));
                }
                isDown = true;
                continue;
            }
            char c = s.charAt(j);
            sb.append(c);
            visits++;
            isDown = !isDown;
        }
        return sb.toString();
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) return arr;
        int mid = arr.length/2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        int[] sortedArr = new int[arr.length];
        int j = 0;
        int i = 0;
        int k = 0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]) {
                sortedArr[k] = leftArr[i++];
            }else {
                sortedArr[k] = rightArr[j++];
            }
            k++;
        }
        System.arraycopy(leftArr, i, sortedArr, k, leftArr.length-i);
        System.arraycopy(rightArr, j, sortedArr, k, rightArr.length - j);

        return sortedArr;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        int[] sortedArr = mergeSort(nums);
        for(int n : sortedArr) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int i = 0; i < sortedArr.length; i++) {
            if(i != 0 && sortedArr[i-1] == sortedArr[i]) continue;

            int n = sortedArr[i]*-1;
            int j = i+1;
            int k = sortedArr.length-1;

            while (j < k) {
                int high = sortedArr[k];
                int low = sortedArr[j];
                int sum = high+low;
                if(sortedArr[j-1] == low && k < sortedArr.length-1 && sortedArr[k+1] == high && sum == n) {
                    j++;
                    k--;
                    continue;
                }

                System.out.println("h: "+high+" l: "+low+" i: "+i);
                if(sum == n) {
                    k--;
                    j++;
                    triplets.add(Arrays.asList(n*-1, low, high));
                    if(low == high) {
                        break;
                    }
                    continue;
                }
                if(sum < n) {
                    j++;
                }
                if(sum > n) {
                    k--;
                }
            }

        }
        return triplets;
    }

    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING", 1));
        System.out.println(threeSum(new int[]{-2,0,0,2,2}).toString());
    }

}
