package b_Arrays;

import java.util.HashMap;

public class Solution_38 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int extra = target - nums[i];
            if (map.containsKey(extra)) {
                int index = map.get(extra);
                return new int[]{map.get(extra),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int[] ans= twoSum(arr,7);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
