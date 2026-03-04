package b_Arrays;
import java.util.*;

public class Solution_58 {

    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if (intervals.size() == 0) return ans;
//
//        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));
//
//        int n = intervals.size();
//        int i = 0;
//
//        while (i < n) {
//            int start = intervals.get(i).get(0);
//            int end = intervals.get(i).get(1);
//            int j = i + 1;
//
//            // merge overlapping intervals
//            while (j < n && intervals.get(j).get(0) <= end) {
//                end = Math.max(end, intervals.get(j).get(1));
//                j++;
//            }
//
//            ans.add(Arrays.asList(start, end));
//            i = j;
//        }
//
//        return ans;
        List<List<Integer>> res = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) return res;

        intervals.sort((a, b) -> a.get(0) - b.get(0));

        int start = intervals.get(0).get(0);
        int end   = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {

            int currStart = intervals.get(i).get(0);
            int currEnd   = intervals.get(i).get(1);

            if (currStart <= end) {
                end = Math.max(end, currEnd);
            }
            else {
                res.add(Arrays.asList(start, end));
                start = currStart;
                end = currEnd;
            }
        }
        res.add(Arrays.asList(start, end));

        return res;
    }

    public static void main(String[] args) {
        Solution_58 obj = new Solution_58();
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1,3));
        intervals.add(Arrays.asList(2,6));
        intervals.add(Arrays.asList(8,10));
        intervals.add(Arrays.asList(15,18));

        System.out.println(obj.mergeOverlap(intervals));
    }
}
