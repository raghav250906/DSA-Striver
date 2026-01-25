package b_Arrays;

import java.util.*;
public class Solution_46 {
    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
            }
            max= Math.max(nums[i],max);
        }
        List<Integer> list1 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        return list1;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 5, 3, 1, 2};
        List<Integer> list1 = leaders(arr);
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
    }
}
