/*
Problem: Check karna hai ki koi subsequence exist karta hai
jiska sum = k ho.

Logic (Recursion):

1. Base Cases:
   - Agar sum == 0
     → valid subsequence mil gayi → return true

   - Agar sum < 0
     → target cross ho gaya → return false

   - Agar index array ke end tak pahunch gaya
     → aur sum 0 nahi hua → return false

2. Har element ke 2 choices:
   a) Include current element
      → sum me se arr[index] subtract karo

   b) Exclude current element
      → next index pe move karo

3. Agar include path se answer mil jaye
   → turant true return karo.

4. Warna exclude path check karo.

Time Complexity: O(2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
public class Solution_11 {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return backTrack(nums,k,0);
    }
    static boolean backTrack(int[] arr, int sum, int index){
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;
        }
        if(index==arr.length){
            return false;
        }
        if(backTrack(arr,sum-arr[index],index+1)){
            return true;
        }
        else return backTrack(arr,sum,index+1);
    }
}
