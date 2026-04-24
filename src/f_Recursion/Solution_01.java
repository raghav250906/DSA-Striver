/*
Problem: Array ke elements use karke aise combinations find karo
jinka sum = target ho (element multiple times use ho sakta hai).

Logic (Backtracking):

1. Base Case:
   - Agar target == 0 → valid combination mila → ans me add karo.
   - Agar target < 0 ya index end pe → invalid → return.

2. Choice 1 (Pick element):
   - curr me element add karo.
   - Same index pe call karo (kyunki reuse allowed hai).
   - target se value subtract karo.

3. Backtrack:
   - Last element remove karo (undo step).

4. Choice 2 (Skip element):
   - Next index pe move karo.

Time Complexity: Exponential (approx 2^N * K)
Space Complexity: O(K) recursion stack
*/
package f_Recursion;
import java.util.*;
public class Solution_01 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backTracking(0,candidates,target,new ArrayList<Integer>(),ans);
        return ans;
    }
    void backTracking(int index, int[] arr, int target,List<Integer> curr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(curr));
            return;
        }
        if(target<0 || index== arr.length){
            return;
        }
        curr.add(arr[index]);
        backTracking(index,arr,target-arr[index],curr,ans);
        curr.remove(curr.size()-1);
        backTracking(index+1,arr,target,curr,ans);
    }
}
