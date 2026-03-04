package c_Binary_Search;

import java.util.*;
public class Solution_77 {
    public static void main(String[] args) {
        int[] arr = {25, 12, 8, 14, 19};
        System.out.println(minimumRateToEatBananas(arr,5));
    }
    static int calculateTH(int[] arr,int mid){
        int tH=0;
        for(int e:arr){
            tH += (int) Math.ceil((double) e/mid);
        }
        return tH;
    }
    public static int minimumRateToEatBananas(int[] nums, int h) {
        int maxPile = Arrays.stream(nums).max().getAsInt();
        int low =1;
        int ans= Integer.MAX_VALUE;
        int high= maxPile;
        while(low<=high){
            int mid=(low+high)/2;
            int totalHrs = calculateTH(nums,mid);
            if(totalHrs<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
