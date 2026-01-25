package b_Arrays;

import java.util.HashMap;

public class Solution_51 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum =0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int remove = prefixSum-k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr,0));
    }
}
