package b_Arrays;

public class Solution_42 {
    public static void printMaxSubArray(int[] nums) {
        int sum=0;
        int start=0;
        int ansStart=-1;
        int ansLast=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansLast=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansStart;i<=ansLast;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={2, 3, 5, -2, 7, -4};
        printMaxSubArray(arr);
    }
}
