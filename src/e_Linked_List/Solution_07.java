/*
 Reverse Doubly Linked List

 Idea:
 Har node ke next aur prev swap kar do.

 Step 1:
 curr = head

 Step 2:
 Har node par:
    temp = curr.prev
    curr.prev = curr.next
    curr.next = temp

 Step 3:
 curr = curr.prev
 (kyunki swap ke baad prev hi next ban gaya)

 Step 4:
 Loop ke baad:
 head = temp.prev
 (last processed node new head banega)

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_07 {
    public static ListNode reverseDLL(ListNode head) {
        if(head==null) return null;
        ListNode temp=null;
        ListNode curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        ListNode head = createList(arr);
        // Test function here
        printForward(reverseDLL(head));
        printBackward(reverseDLL(head));
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
