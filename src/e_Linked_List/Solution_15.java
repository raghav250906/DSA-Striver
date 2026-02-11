/*
 Odd Even Linked List

 Goal:
 Saare odd index nodes pehle,
 phir even index nodes.

 Step 1:
 odd = head
 even = head.next
 evenHead store karo (baad me connect karne ke liye)

 Step 2:
 odd.next = even.next   → odd ko next odd se jodo
 even.next = odd.next   → even ko next even se jodo

 Step 3:
 Loop jab tak even aur even.next exist kare.

 Step 4:
 Last me odd.next = evenHead
 (odd list + even list connect)

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_15 {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next=evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ListNode head = createList(arr);
// Test your function
        printList(oddEvenList(head));
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
