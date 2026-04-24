/*
Problem: Linked list ka deep copy banana hai
jisme next + random pointers dono ho.

Logic (3 Step Trick):

1. Clone nodes insert karo:
   - Har original node ke baad uska copy insert karo.
   - (A → B) ban jayega (A → A' → B → B')

2. Random pointer set karo:
   - Agar curr.random != null
   - To curr.next.random = curr.random.next
   (kyunki copy node hamesha original ke baad hai)

3. Separate lists:
   - Original aur copied list ko alag karo.
   - Next pointers fix karke final deep copy return karo.

Time Complexity: O(N)
Space Complexity: O(1) (no extra map used)
*/

package e_Linked_List;

public class Solution_26 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr =head;
        while(curr!=null){
            Node copy = new Node(curr.val);
            copy.next=curr.next;
            curr.next=copy;
            curr=copy.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        curr=head;
        Node dummy= new Node(0);
        Node copyCurr = dummy;
        while(curr!=null){
            copyCurr.next=curr.next;
            curr.next=curr.next.next;
            curr=curr.next;
            copyCurr=copyCurr.next;
        }
        return dummy.next;
    }
}

