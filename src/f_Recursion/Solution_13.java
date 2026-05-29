/*
Problem: String ko aise partition karna hai ki
har substring palindrome ho.

Example:
"aab" → [[a,a,b], [aa,b]]

Logic (Backtracking):

1. Base Case:
   - Agar string empty ho jaye
     → ek valid partition mil gaya
     → answer me add karo.

2. Har possible prefix try karo:
   - substring(0,i) nikalo.

3. Palindrome Check:
   - Agar prefix palindrome nahi hai
     → skip karo.

4. Pick:
   - Palindrome substring curr me add karo.

5. Recursive Call:
   - Remaining string par recursion chalao.

6. Backtrack:
   - Last added substring remove karo
   - Taaki next partition explore kar sake.

Time Complexity: O(N * 2^N)
Space Complexity: O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_13 {
    public List<List<String>> partition(String s) {
        int l= s.length()-1;
        List<List<String>> ans = new ArrayList<>();
        List<String> curr= new ArrayList<>();
        backTrack(ans,curr,s);
        return ans;
    }
    static void backTrack(List<List<String>> ans,List<String> curr,String s){
        if(s.isEmpty()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String temp = s.substring(0,i);
            if(!isPalindrome(temp)) continue;
            curr.add(temp);
            backTrack(ans,curr,s.substring(i,s.length()));
            curr.remove(curr.size()-1);
        }
    }
    static boolean isPalindrome(String s){
        if(s.isEmpty()) return false;
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low++)!=s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
