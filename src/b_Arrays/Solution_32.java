package b_Arrays;

public class Solution_32 {
    public static int linearSearch(int nums[], int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(linearSearch(arr,3));
    }

}
