package c_Binary_Search;

public class Solution_70 {
    public static void main(String[] args) {
        int[] arr={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchInARotatedSortedArrayII(arr,3));
    }
    public static boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int n= nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==k) return true;
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
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
        return false;
    }
}
