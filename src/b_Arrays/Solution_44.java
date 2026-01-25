package b_Arrays;

import java.util.ArrayList;

public class Solution_44 {
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i< nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int i=0;
        int p=0;
        int n=0;
        while(p<pos.size() && n< neg.size()){
            nums[i++]=pos.get(p++);
            nums[i++]=neg.get(n++);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={1,-1,-3,-4,2,3};
        int[] arr1=rearrangeArray(arr);
        for(int i=0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
