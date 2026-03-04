package c_Binary_Search;

import java.util.Arrays;

public class Solution_82 {
    static boolean canPlace(int[] arr,int cows, int dist){
        int count=1;
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] - last >= dist){
                count++;
                last=arr[i];
            }
            if(count >= cows) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n= nums.length;
        int low=1;
        int high = nums[n-1] - nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlace(nums,k,mid)){
                low=mid+1;
            }
            else high = mid-1;
        }
        return high;
    }
}
