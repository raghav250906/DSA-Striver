/*
Problem: Count karna hai kitni subsequences ka sum = k hota hai.

Logic (Recursion):

1. Base Cases:
   - Agar sum == 0
     → valid subsequence mil gayi → return 1

   - Agar sum < 0
     → invalid case → return 0

   - Agar index array ke end tak pahunch gaya
     → aur sum abhi bhi 0 nahi hua
     → return 0

2. Har element ke 2 choices:
   a) Include current element
      → sum me se arr[index] subtract karo

   b) Exclude current element
      → next index pe move karo

3. Dono recursive calls ka count add karo.

Time Complexity: O(2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
public class Solution_10 {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return backTrack(nums,k,0);
    }
    static int backTrack(int[] arr, int sum, int index){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(index==arr.length){
            return 0;
        }
        int count=0;
        count+= backTrack(arr,sum-arr[index],index+1);
        count+= backTrack(arr,sum,index+1);
        return count;
    }
}
