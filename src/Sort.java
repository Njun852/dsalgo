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

    public static void quickSort(int[] a, int low, int high) {
        if(low >= high || low < 0) return;
        int p = partition(a, low, high);
        quickSort(a, low, p-1);
        quickSort(a, p+1, high);
    }

    //lomoto partition
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        for(int j = low; j < high; j++) {
            if(a[j] < pivot) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1 ,6};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
