/*
Problem: String me brackets valid hain ya nahi
check karna hai.

Valid pairs:

()  []  {}

Logic (Stack):

1. Opening brackets ko stack me push karo.

2. Closing bracket milne par:

   - Stack empty nahi hona chahiye.
   - Stack ke top par matching
     opening bracket hona chahiye.

3. Agar matching bracket nahi mila
   to string invalid hai.

4. Har valid pair milne par
   opening bracket stack se remove kar do.

5. String traverse hone ke baad:

   - Stack empty hai → valid
   - Stack me elements bache hain → invalid

6. Stack brackets ke nesting order ko
   maintain karne me help karta hai.

Time Complexity: O(N)

Space Complexity: O(N)

N = s.length()
*/

package h_Stack_and_Queues;
import java.util.*;
public class Solution_05 {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch ==')' && !stack.isEmpty()){
                if(stack.pop() != '(') return false;
            }
            else if(ch ==']' && !stack.isEmpty()){
                if(stack.pop() != '[') return false;
            }
            else if(ch =='}' && !stack.isEmpty()){
                if(stack.pop() != '{') return false;
            }
            else stack.push(ch);
        }
        return stack.isEmpty();
    }
}
