package b_Arrays;

import java.util.*;
public class Solution_37 {
    public static  int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> firstIndex = new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                maxLen= Math.max(maxLen,i+1);
            }
            if(firstIndex.containsKey(sum-k)){
                int len= i - firstIndex.get(sum-k);
                maxLen= Math.max(maxLen, len);
            }
            if(!firstIndex.containsKey(sum)){
                firstIndex.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr= {-3, 2, 1};
        System.out.println(longestSubarray(arr,6));
    }
}
