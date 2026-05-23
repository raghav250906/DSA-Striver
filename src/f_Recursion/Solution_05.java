/*
Problem: n pairs ke valid parentheses combinations generate karne hain.

Logic (Backtracking):

1. Base Case:
   - Agar string ki length == 2*n
     → valid combination mila → list me add karo.

2. Add Opening Bracket '(':
   - Agar left < n
     → '(' add kar sakte hain.

3. Add Closing Bracket ')':
   - Agar right < left
     → ')' add kar sakte hain.
   - Isse invalid combinations avoid hote hain.

4. Recursion:
   - Har step pe ek choice pick karke next state explore karo.

Important:
- right kabhi left se zyada nahi ho sakta.
- Isi condition se valid parentheses bante hain.

Time Complexity: O(2^N) approx
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_05 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        recursion(list,0,0,"",n);
        return list;
    }
    static void recursion(ArrayList<String> list,int right,int left,String s,int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(left<n){
            recursion(list,right,left+1,s+"(",n);
        }
        if(right<left){
            recursion(list,right+1,left,s+")",n);
        }
    }
}
