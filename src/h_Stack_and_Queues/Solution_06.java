/*
Problem: Aisa Stack design karna hai jo
push, pop, top aur getMin operations ko
O(1) time me perform kare.

Logic (Single Stack + Encoding):

1. Ek variable 'min' current minimum
   element track karta hai.

2. Normal case:

   - Agar value >= min hai,
     directly stack me push kar do.

3. New minimum aane par:

   - Actual value push nahi karte.
   - Encoded value store karte hain:

     2 * value - min

   - Fir min ko update kar dete hain.

4. Encoded value hamesha current min
   se chhoti hoti hai.

5. Top Operation:

   - Agar top >= min:
     normal value return karo.

   - Agar top < min:
     iska matlab encoded value hai,
     actual top current min hoga.

6. Pop Operation:

   - Agar popped value >= min:
     normal pop hai.

   - Agar popped value < min:
     encoded value remove hui hai.

     Previous minimum recover karo:

     min = 2 * min - poppedValue

7. Is trick ki wajah se minimum element
   ko separate stack ke bina maintain
   kar sakte hain.

Time Complexity:
Push   -> O(1)
Pop    -> O(1)
Top    -> O(1)
GetMin -> O(1)

Space Complexity: O(N)
*/

package h_Stack_and_Queues;
import java.util.*;
public class Solution_06 {
    long min;
    Stack<Long> s;

    public Solution_06() {
        s = new Stack<>();
    }

    public void push(int val) {
        long v = val;

        if(s.isEmpty()) {
            min = v;
            s.push(v);
        }
        else if(v >= min) {
            s.push(v);
        }
        else {
            s.push(2 * v - min);
            min = v;
        }
    }

    public void pop() {
        if(s.isEmpty()) return;
        long top = s.pop();
        if(top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = s.peek();
        if(top < min) {
            return (int) min;
        }
        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }

    //Another approach but not optimal due to SC= O(2*n)
    // Stack<int[]>s;
    // public MinStack() {
    //     s= new Stack<>();
    // }

    // public void push(int val) {
    //     if(s.isEmpty()){
    //         s.push(new int[]{val,val});
    //     }
    //     else s.push(new int[] {val,Math.min(val,s.peek()[1])});
    // }

    // public void pop() {
    //     s.pop();
    // }

    // public int top() {
    //     return s.peek()[0];
    // }

    // public int getMin() {
    //     return s.peek()[1];
    // }
}
