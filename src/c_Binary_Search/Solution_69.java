package c_Binary_Search;

public class Solution_69 {
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int k) {
        int n= nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==k) return mid;
            // if left part is sorted
            if(nums[mid]>=nums[low]){
                if(nums[low]<=k && nums[mid]>k){
                    high=mid-1;
                }
                else low=mid+1;
            }
            // otherwise right part is sorted
            else{
                if (nums[mid] < k && k <= nums[high]) {
                    low = mid + 1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
}
