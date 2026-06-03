/*
Problem: Stack ka use karke Queue implement karni hai.

Logic (Two Stacks):

1. Queue FIFO principle follow karti hai.

   First In → First Out

2. Push Operation ko costly banaya gaya hai
   taaki front element hamesha top par rahe.

3. Push Operation:

   - s1 ke saare elements s2 me transfer karo.
   - Naya element s1 me push karo.
   - s2 ke saare elements wapas s1 me daal do.

4. Is process ke baad sabse purana element
   s1 ke top par aa jata hai.

5. Pop Operation:

   - Direct s1 ke top ko remove karo.

6. Peek Operation:

   - s1 ka top return karo.

7. Empty Operation:

   - Check karo s1 empty hai ya nahi.

8. Is implementation me queue ka front
   hamesha s1 ke top par maintain rehta hai.

Time Complexity:
Push  -> O(N)
Pop   -> O(1)
Peek  -> O(1)
Empty -> O(1)

Space Complexity: O(N)
*/

package h_Stack_and_Queues;
import java.util.*;
public class Solution_04 {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public Solution_04() {
        s1= new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
