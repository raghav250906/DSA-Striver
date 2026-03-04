/*
 Problem:
 Linked List ke HEAD node ko delete karna hai.

 Logic:
 - Agar head null hai, matlab list empty hai → kuch delete nahi ho sakta.
 - Agar list empty nahi hai:
     head ke next node ko new head bana do.

 Visual:
 Old List: 10 -> 20 -> 30

 Delete Head:

 New List:
 20 -> 30

 Important:
 Purana head automatically GC (garbage collected) ho jata hai.
*/

package e_Linked_List;
public class Solution_02 {
    public static ListNode deleteHead(ListNode head) {
        if(head==null){
            return null;
        }
        return head.next;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
        // Test your function
        printList(deleteHead(head));
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
