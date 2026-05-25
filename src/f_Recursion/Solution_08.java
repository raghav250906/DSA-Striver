
/*
Problem: 1 se 9 tak numbers use karke
exactly k numbers ka combination find karna hai
jinka sum = n ho.

Conditions:
- Har number sirf ek baar use hoga.
- Duplicate combinations allowed nahi hain.

Logic (Backtracking):

1. Base Case:
   - Agar currSum > sum ya curr.size() > size
     → invalid case → return

   - Agar currSum == sum && curr.size() == size
     → valid combination mila → list me add karo

2. Loop from current number:
   - 1 se 9 tak numbers try karo.

3. Pruning:
   - Agar currSum + i > sum
     → break (aage aur bade numbers honge)

4. Pick:
   - curr me number add karo.
   - Recursive call i+1 se
     (same number dubara use nahi hoga)

5. Backtrack:
   - Last element remove karo.

Time Complexity: Exponential
Space Complexity: O(K) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_08 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(list,curr,1,k,n,0);
        return list;
    }
    static void backtrack(List<List<Integer>> list,ArrayList<Integer>curr,int num,int size, int sum,int currSum){
        if(currSum>sum || curr.size()>size) return;
        if(currSum==sum && curr.size()==size){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=num;i<=9;i++){
            if(currSum+i>sum) break;
            curr.add(i);
            backtrack(list,curr,i+1,size,sum,currSum+i);
            curr.remove(curr.size()-1);
        }
    }
}
