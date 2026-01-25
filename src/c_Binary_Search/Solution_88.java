package c_Binary_Search;

public class Solution_88 {
    public int kthElement(int[] arr1, int[] arr2, int k) {
        if (arr1.length > arr2.length) return kthElement(arr2, arr1,k);

        int n1 = arr1.length;
        int n2 = arr2.length;

        int left = k, low = Math.max(0, k - n2), high = Math.min(k, n1);

        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;

            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return -1;
    }
}
