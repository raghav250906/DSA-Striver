/*
 Insert Before Head (Doubly Linked List)

 Step 1:
 New node banao.

 Step 2:
 Agar list empty hai →
 new node hi head banega.

 Step 3:
 newNode.next = head
 head.prev = newNode

 Step 4:
 Head update karo (head = newNode)

 Return new head.

 TC: O(1)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_05 {
    public static ListNode insertBeforeHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head==null) return newNode;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return newNode;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        ListNode head = createList(arr);
        // your function here
        printForward(insertBeforeHead(head,5));
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
