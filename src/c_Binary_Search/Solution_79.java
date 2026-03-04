package c_Binary_Search;

import java.util.Arrays;

public class Solution_79 {
    static int sumByD(int[] arr,int div){
        int sum=0;
        for(int e:arr){
            sum+= Math.ceil((double) e/div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int limit) {
        if(nums.length>limit) return -1;
        int low=1;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid= (low+high)/2;
            if(sumByD(nums,mid)<=limit){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
