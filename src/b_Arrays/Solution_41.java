package b_Arrays;

public class Solution_41 {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(arr));
    }
}
