package f_Recursion;
public class Solution_11 {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return backTrack(nums,k,0);
    }
    static boolean backTrack(int[] arr, int sum, int index){
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;
        }
        if(index==arr.length){
            return false;
        }
        if(backTrack(arr,sum-arr[index],index+1)){
            return true;
        }
        else return backTrack(arr,sum,index+1);
    }
}
