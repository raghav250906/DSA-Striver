/*
Problem: Length n ke saare binary strings generate karne hain
jisme consecutive 1's na ho.

Logic (Backtracking):

1. Base Case:
   - Agar string ki length n ho gayi
     → valid string answer me add karo.

2. Last character check:
   - Agar previous char '1' hai
     → next sirf '0' add kar sakte hain.

3. Agar previous char '0' hai ya string empty hai:
   - Dono choices possible:
     → append '0'
     → append '1'

4. Har recursive call ek new valid binary string build karti hai.

Time Complexity: O(2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_09 {
    public List<String> generateBinaryStrings(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans,n,"");
        return ans;
    }
    static void backTrack(List<String> ans, int n, String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        if(s.length()>0 && s.charAt(s.length()-1)=='1'){
            backTrack(ans,n,s+"0");
        }
        else{
            backTrack(ans,n,s+"0");
            backTrack(ans,n,s+"1");
        }
    }
}
