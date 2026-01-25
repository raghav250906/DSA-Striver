package c_Binary_Search;

public class Solution_78 {
    static boolean isPossible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int noOfB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += cnt / k;
                cnt = 0;
            }
        }

        noOfB += cnt / k;
        return noOfB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;
        if (required > bloomDay.length) return -1;

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        int low = minDay, high = maxDay, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
