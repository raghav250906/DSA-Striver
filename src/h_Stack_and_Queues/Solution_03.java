/*
Problem: Queue ka use karke Stack implement karna hai.

Logic (Single Queue):

1. Stack LIFO principle follow karta hai.

   Last In → First Out

2. Queue FIFO hoti hai, isliye push ke time
   elements ko rotate karna padega.

3. Push Operation:

   - Naya element queue me add karo.
   - Uske baad pehle se present saare elements
     ko queue ke end me move kar do.

4. Rotation ke baad naya element
   queue ke front par aa jayega.

5. Isse queue ka front hamesha
   stack ka top represent karega.

6. Pop Operation:

   - Queue ka front remove karo.

7. Top Operation:

   - Queue ka front return karo.

8. Empty Operation:

   - Check karo queue empty hai ya nahi.

Time Complexity:
Push  -> O(N)
Pop   -> O(1)
Top   -> O(1)
Empty -> O(1)

Space Complexity: O(N)
*/

package h_Stack_and_Queues;
import java.util.*;
public class Solution_03 {
    Queue<Integer> q;
    public Solution_03() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        int size= q.size();
        q.offer(x);
        for(int i=1;i<=size;i++){
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.size()==0;
    }
}
