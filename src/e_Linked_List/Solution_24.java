/*
Problem: Linked List ko right side me k times rotate karna hai.

Logic:

1. Edge Case:
   - Agar list empty hai ya single node hai → return head.

2. Length Find:
   - Puri list traverse karke length nikalte hain.
   - Last node ko head se connect karke circular list bana dete hain.

3. Effective Rotation:
   - k = k % length (extra rotations avoid karne ke liye)

4. New Tail Find:
   - New tail = (length - k)th node
   - Uske next wala node new head banega

5. Break Circle:
   - newTail.next = null → circular list ko tod dete hain

Time Complexity: O(N)
Space Complexity: O(1)
*/

package e_Linked_List;

public class Solution_24 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
        k=k%length;
        int stepsToNewTail = length-k;
        ListNode newTail = head;
        for(int i=1;i<stepsToNewTail;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;
    }
    // Singly Linked List Template for IDE

    public static void main(String[] args) {
        int[] arr = {10, 20, 30,40,50};
        ListNode head = createList(arr);
// Test your function
        printList(rotateRight(head,2));
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    // Create Linked List from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    // Print Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
