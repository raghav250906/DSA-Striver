/*
Problem: Array ke saare possible subsets generate karne hain.

Logic (Backtracking):

1. Har recursion call pe current subset answer me add karo.

2. Loop through remaining elements:
   - Har element ko ek baar pick karo.

3. Pick:
   - curr me current element add karo.

4. Recursive Call:
   - Next index se recursion chalao.

5. Backtrack:
   - Last added element remove karo
   - Taaki next possibilities explore kar sake.

Time Complexity: O(2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_06 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0,ans,new ArrayList<Integer>(),nums);
        return ans;
    }
    static void subsets(int index, List<List<Integer>> ans,List<Integer> curr,int[] arr){
        ans.add(new ArrayList(curr));
        for(int i=index;i<arr.length;i++){
            curr.add(arr[i]);
            subsets(i+1,ans,curr,arr);
            curr.remove(curr.size()-1);
        }
    }
}
