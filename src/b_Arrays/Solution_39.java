package b_Arrays;

public class Solution_39 {
    public static void sortZeroOneTwo(int[] nums) {
        int low=0;
        int high = nums.length-1;
        int mid = 0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] ans= {1,0,2,1,0};
        sortZeroOneTwo(ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
