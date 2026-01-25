package b_Arrays;

public class Solution_45 {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }

        reverse(arr, index + 1, n - 1);
    }

    static void reverse(int[] arr, int start, int last) {
        while (start < last) {
            swap(arr, start, last);
            start++;
            last--;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

