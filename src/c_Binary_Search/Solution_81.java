package c_Binary_Search;

public class Solution_81 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10};
        System.out.println(findKthPositive(arr,6));
    }
    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+ ((high-low)/2);
            int currentMissing = arr[mid] - (mid+1);
            if(currentMissing < k){
                low= mid+1;
            }
            else high = mid-1;
        }
        return low+k;
    }
}
