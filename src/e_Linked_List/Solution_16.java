/*
 Remove Nth Node From End

 Trick:
 Fast & Slow pointer use karo.

 Step 1:
 Dummy node banao → edge case handle hoga
 (jab head delete karna ho).

 Step 2:
 Fast ko n steps aage badhao.

 Step 3:
 Fast aur slow ko saath chalao
 jab tak fast last node par na pahunch jaye.

 Step 4:
 Slow.next = slow.next.next
 (Nth node delete)

 Return dummy.next (new head)

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_16 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
// Test your function
        printList(removeNthFromEnd(head,2));
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
