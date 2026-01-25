package c_Binary_Search;

public class Solution_93 {
    int countLessEqual(int[] row, int mid) {
        int low = 0, high = row.length;
        while (low < high) {
            int m = (low + high) / 2;
            if (row[m] <= mid) low = m + 1;
            else high = m;
        }
        return low;
    }

    int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[0][cols - 1];
        for (int i = 1; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;
            for (int i = 0; i < rows; i++) {
                count += countLessEqual(matrix[i], mid);
            }
            if (count < (rows * cols + 1) / 2)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
