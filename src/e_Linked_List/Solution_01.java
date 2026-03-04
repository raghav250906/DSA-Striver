/*
 Problem:
 Insert a node at the HEAD (beginning) of a Linked List.

 Logic:
 - Ek new node create karo with given value X.
 - New node ka next pointer current head ko point karega.
 - Fir new node hi new head ban jayega.

 Visual:
 Old List: 10 -> 20 -> 30

 Insert 7 at head:

 New List:
 7 -> 10 -> 20 -> 30

 Important:
 Head change ho raha hai, isliye return newNode.
*/

package e_Linked_List;
public class Solution_01 {
    public static ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next=head;
        return newNode;
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
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
        // Test your function
        ListNode node = insertAtHead(head,7);
        printList(node);
    }
}
