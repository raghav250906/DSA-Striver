/*
Problem: Unique combinations find karo jinka sum = target ho
(lekin har element sirf ek baar use hoga + duplicates avoid karne hain).

Logic (Backtracking + Sorting):

1. Sort array:
   - Taaki duplicates handle ho sake aur pruning ho.

2. Base Case:
   - Agar target == 0 → valid combination → ans me add.
   - Agar target < 0 → return.

3. Loop from index:
   - Har element ko pick karne ki try karo.

4. Duplicate skip:
   - Agar i > index && arr[i] == arr[i-1]
     → same level pe duplicate avoid → continue

5. Pruning:
   - Agar arr[i] > target → break (kyunki sorted hai)

6. Pick & Move:
   - curr.add(arr[i])
   - next call i+1 se (reuse allowed nahi hai)

7. Backtrack:
   - curr.remove(last)

Time Complexity: Exponential
Space Complexity: O(K) recursion stack
*/
package f_Recursion;
import java.util.*;
public class Solution_02 {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            backTracking(0,candidates,target,new ArrayList<Integer>(),ans);
            return ans;
        }
        void backTracking(int index, int[] arr, int target, ArrayList<Integer> curr,List<List<Integer>> ans){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                return;
            }
            if(target<0 || index==arr.length){
                return;
            }
            for(int i=index; i<arr.length;i++){
                if(i>index && arr[i]==arr[i-1]){
                    continue;
                }
                if(arr[i]>target){
                    break;
                }
                curr.add(arr[i]);
                backTracking(i+1,arr,target-arr[i],curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
}
