/*
 Sort Linked List (Merge Sort)

 Idea:
 Linked List me random access nahi hota,
 isliye QuickSort efficient nahi.
 Merge Sort best choice hai.

 Step 1:
 Slow & Fast pointer se list ko 2 halves me split karo.
 (prev.next = null se break karo)

 Step 2:
 Dono halves ko recursively sort karo.

 Step 3:
 Merge function se dono sorted lists combine karo.

 Merge Logic:
 Dummy node use karo.
 Choti value wale node ko attach karo.
 End me remaining nodes attach kar do.

 TC: O(N log N)
 SC: O(log N)  (recursive stack)
*/

package e_Linked_List;

public class Solution_18 {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }

    private static ListNode merge(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 10, 20, 30};
        ListNode head = createList(arr);
        // Test your function
        printList(sortList(head));
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
