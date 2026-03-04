package b_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution_61 {

    //Count Inversion
    /*
    static long mergeSort(int[] arr, int low, int high){
        long count=0;
        if(low>=high) return count;
        int mid = (low+high)/2;

        count+=mergeSort(arr,low, mid);

        count+=mergeSort(arr,mid+1,high);

        count+=merge(arr,low,mid,high);
        return count;
    }

    static long merge(int[]arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left= low;
        int right= mid+1;
        long count=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
                count+= (mid-left+1);
            }
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
        return count;
    }
    public static long numberOfInversions(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }*/

    // Reverse Pairs
    /*
    public static int reversePairs(int[] nums) {
        return (int) mergeSort(nums, 0, nums.length - 1);
    }

    static long mergeSort(int[] arr, int low, int high) {
        long count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
        }

        static long countPairs(int[] arr, int low, int mid, int high) {
            long count = 0;
            int right = mid + 1;

            for (int left = low; left <= mid; left++) {
                while (right <= high && (long) arr[left] > 2L * arr[right]) {
                    right++;
                }
                count += (right - (mid + 1));
            }
            return count;
        }

        static void merge(int[] arr, int low, int mid, int high) {
            int[] temp = new int[high - low + 1];
            int left = low, right = mid + 1, k = 0;

            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp[k++] = arr[left++];
                } else {
                    temp[k++] = arr[right++];
                }
            }

            while (left <= mid) temp[k++] = arr[left++];
            while (right <= high) temp[k++] = arr[right++];

            for (int i = low; i <= high; i++) {
                arr[i] = temp[i - low];
            }
    }
     */

    //Maximum product subarray in an array
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 7, 1, 3, 5};
    }
}
