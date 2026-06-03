/*
Problem: Circular Queue ko array ka use karke
implement karna hai.

Logic (Circular Queue):

1. Queue FIFO principle follow karti hai.

   First In → First Out

2. Array queue ke elements store karega.

3. 'front' first element ka index rakhta hai.

4. 'rear' last inserted element ka index rakhta hai.

5. Initially:

   front = -1
   rear = -1

   Matlab queue empty hai.

6. Enqueue Operation:

   - Agar queue full hai to kuch mat karo.
   - Empty queue me front ko 0 set karo.
   - Rear ko circular way me move karo:

     rear = (rear + 1) % n

   - Element insert kar do.

7. Dequeue Operation:

   - Agar queue empty hai to return.
   - Agar sirf ek element hai:

     front = rear = -1

   - Warna front ko circular way me
     next position par move karo.

8. Circular Queue me modulo (%) use karke
   last index ke baad phir se starting index
   par aa sakte hain.

9. Helper Functions:

   - isEmpty() → front == -1
   - isFull() → (rear + 1) % n == front

10. Front aur Rear element direct
    indexing se access kiye ja sakte hain.

Time Complexity:
Enqueue  -> O(1)
Dequeue  -> O(1)
Front    -> O(1)
Rear     -> O(1)

Space Complexity: O(N)
*/

package h_Stack_and_Queues;

public class Solution_02 {
    int[] queue;
    int n;
    int front;
    int rear;
    public Solution_02(int size) {
        n=size;
        queue= new int[n];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty() {
        return (front==-1);
    }
    public boolean isFull() {
        return (rear+1)%n==front;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()) return;
        if(isEmpty()) front=0;
        rear=(rear+1)%n;
        queue[rear]=x;
    }
    public void dequeue() {
        if(isEmpty()) return;
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else front=(front+1)%n;
    }
    public int getFront() {
        if(isEmpty()) return -1;
        return queue[front];
    }
    public int getRear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
}
