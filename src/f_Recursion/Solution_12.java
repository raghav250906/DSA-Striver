/*
Problem: Phone keypad ke digits se saare possible
letter combinations generate karne hain.

Example:
"23" → [ad, ae, af, bd, be, bf, cd, ce, cf]

Logic (Backtracking):

1. Har digit ke corresponding letters map me store hain.

2. Base Case:
   - Agar unprocessed string (up) empty ho jaye
     → ek complete combination ban gaya
     → answer me add karo.

3. Current digit nikalo:
   - Pehle digit ka letters string fetch karo.

4. Loop through letters:
   - Har character ko current answer (p) me add karo.

5. Recursive Call:
   - Remaining digits (up.substring(1))
     ke liye combinations generate karo.

6. Sab paths explore hoke saare possible
   combinations mil jayenge.

Time Complexity: O(4^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_12 {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        assign(map);
        List<String> ans = new ArrayList<>();
        backTrack(ans,"",digits,map);
        return ans;
    }
    static void backTrack(List<String> ans,String p, String up,HashMap<Integer,String> map){
        if(up.length()==0){
            ans.add(p);
            return;
        }
        int index= up.charAt(0) - '0';
        String s= map.get(index);
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            backTrack(ans,p+ch,up.substring(1),map);
        }
    }
    static void assign(HashMap<Integer,String> map){
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
}
