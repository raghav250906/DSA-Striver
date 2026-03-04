package c_Binary_Search;

public class Solution_63 {
    public static int lowerBound(int[] nums, int x) {
        int n=nums.length;
        int low=0;
        int high =n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=x){
                ans=mid;
                high= mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(lowerBound(arr,2));
    }
}
