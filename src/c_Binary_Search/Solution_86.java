package c_Binary_Search;

public class Solution_86 {
    static boolean isPossible(int[] arr, int k, double dist) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            double gap = arr[i] - arr[i - 1];
            count += (int)(gap / dist);
        }
        return count <= k;
    }

    public static double minimiseMaxDistance(int[] arr, int k) {
        double low = 0;
        double high = 0;

        // Step 1: find max gap
        for (int i = 1; i < arr.length; i++) {
            high = Math.max(high, arr[i] - arr[i - 1]);
        }

        // Step 2: binary search on answer
        while (high - low > 1e-6) {
            double mid = (low + high) / 2;
            if (isPossible(arr, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

}
