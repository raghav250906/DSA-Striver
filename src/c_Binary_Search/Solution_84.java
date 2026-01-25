package c_Binary_Search;

public class Solution_84 {
    static int countSplits(int[] arr,int sum){
        int subArraySum = 0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(subArraySum + arr[i] <= sum){
                subArraySum+=arr[i];
            }
            else{
                count++;
                subArraySum = arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int n= nums.length;
        if(k>n) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0; i< nums.length;i++){
            high+=nums[i];
            if(low<nums[i]){
                low=nums[i];
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            int splits = countSplits(nums,mid);
            if(splits>k){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
}
