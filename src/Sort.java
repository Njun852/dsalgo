import java.util.Arrays;

public class Sort {

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

    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 5, 0};
        int[] sortedArr = mergeSort(arr);

        for(int n : sortedArr) {
            System.out.print(n+" ");
        }

    }
}
