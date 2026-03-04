package b_Arrays;

public class Solution_35 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=1){
                count=0;
                continue;
            }
            count++;
            if(count>max){
                max=count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
