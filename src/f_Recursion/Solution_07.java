
/*
Problem: Array ke saare unique subsets generate karne hain
(duplicates subsets allowed nahi hain).

Logic (Backtracking):

1. Sort array:
   - Taaki duplicate elements adjacent aa jaye
   - Duplicate subsets avoid karna easy ho.

2. Add current subset:
   - Har recursion call pe current subset answer me add karo.

3. Loop through elements:
   - Har element ko pick karke next subsets banao.

4. Skip duplicates:
   - Agar i > index && arr[i] == arr[i-1]
     → same level pe duplicate skip karo.

5. Pick:
   - curr me element add karo.
   - Recursive call next index se karo.

6. Backtrack:
   - Last element remove karo.

Time Complexity: O(2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_07 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(0,nums,new ArrayList<Integer>(),ans);
        return ans;
    }
    static void backtracking(int index,int[] arr, ArrayList<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList(curr));
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            backtracking(i+1,arr,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}
