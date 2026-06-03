/*
Problem: Array ka use karke Stack implement karna hai.

Logic (Array Based Stack):

1. Stack LIFO principle follow karta hai.

   Last In → First Out

2. Array stack ke elements store karega.

3. 'top' variable stack ke top element
   ka index maintain karta hai.

4. Initially:

   top = -1

   Matlab stack empty hai.

5. Push Operation:

   - Agar stack full nahi hai,
     top ko increase karo.
   - Element ko stack[top] par store karo.

6. Pop Operation:

   - Agar stack empty nahi hai,
     top ko decrease kar do.

7. Peek Operation:

   - Stack ke top element ko return karo.
   - Agar stack empty ho to -1 return karo.

8. Helper Functions:

   - isEmpty() → top == -1
   - isFull() → top == n - 1

Time Complexity:
Push  -> O(1)
Pop   -> O(1)
Peek  -> O(1)

Space Complexity: O(N)
*/

package h_Stack_and_Queues;

public class Solution_01 {
    private int[] stack;
    private int top;
    private int n;
    public Solution_01(int s) {
        n=s;
        stack= new int[n];
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==n-1;
    }

    public void push(int x) {
        if(!isFull()){
            stack[++top]=x;
        }
    }

    public void pop() {
        if(!isEmpty()){
            top--;
        }
    }

    public int peek() {
        if(top==-1) return -1;
        return stack[top];
    }
}
