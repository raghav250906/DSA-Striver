package b_Arrays;

public class Solution_28 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        System.out.println(removeDuplicates(arr));
    }
}
