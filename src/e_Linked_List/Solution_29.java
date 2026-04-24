package e_Linked_List;

public class Solution_29 {
    ListNode removeDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                ListNode delete = curr.next;
                curr.next=delete.next;
                if(delete.next!=null){
                    delete.next.prev=curr;
                }
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        ListNode head = createList(arr);
        // Test function here

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
