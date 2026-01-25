package b_Arrays;

import java.util.HashSet;

public class Solution_47 {
    public static int longestConsecutive(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;
        int longest=1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int e:set){
            if(!set.contains(e-1)){
                int count=1;
                int x=e;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr= {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
}
