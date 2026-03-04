package b_Arrays;

import java.util.*;
public class Solution_55 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int l=i+1;l<n-2;l++){
                if(l>i+1 && nums[l]==nums[l-1]) continue;
                int j= l+1;
                int k=n-1;
                while(j<k){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i] , nums[l] , nums[j] , nums[k]));
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]) j++;
                        while(j<k && nums[k]==nums[k+1]) k--;
                    }
                    else if(sum<target) j++;
                    else k--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, 7, 9};
        int n = arr.length;
        List<List<Integer>> res = fourSum(arr,7);
        for (List<Integer> quad : res) {
            for (int num : quad) System.out.print(num + " ");
            System.out.println();
        }
    }
}
