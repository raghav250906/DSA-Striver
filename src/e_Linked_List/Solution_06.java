/*
 Delete Head (Doubly Linked List)

 Edge Case:
 Agar list empty hai ya sirf 1 node hai →
 return null.

 Step 1:
 Head ko next node par shift karo.
    head = head.next

 Step 2:
 Naye head ka prev null karo.
    head.prev = null

 Return new head.

 TC: O(1)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_06 {
    public static ListNode deleteHead(ListNode head) {
        if(head==null || head.next==null) return null;
        head=head.next;
        head.prev=null;
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        ListNode head = createList(arr);
        // Test function here
        printForward(deleteHead(head));
        printBackward(deleteHead(head));
    }

    static class ListNode {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // Create DLL from array
    public static ListNode createList(int[] arr) {

        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    // Print forward
    public static void printForward(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    public static void printBackward(ListNode head) {

        if (head == null) return;

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}
