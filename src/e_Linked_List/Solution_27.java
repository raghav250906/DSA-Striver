package e_Linked_List;

public class Solution_27 {
    public static ListNode deleteAllOccurrences(ListNode head,int target){
        ListNode curr = head;
        while(curr!=null){
            if(curr.data==target){
                if(curr.prev==null){
                    head=curr.next;
                    if(head!=null){
                        head.prev=null;
                    }
                }
                else{
                    curr.prev.next=curr.next;
                    if(curr.next!=null){
                        curr.next.prev=curr.prev;
                    }
                }
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30,20, 40};

        ListNode head = createList(arr);
        // Test function here
        printForward(deleteAllOccurrences(head,20));
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
