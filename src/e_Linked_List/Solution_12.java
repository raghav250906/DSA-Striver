/*
 Detect Cycle Start in Linked List (Floyd Algorithm)

 Step 1:
 Slow = 1 step, Fast = 2 steps.
 Agar dono mil gaye → cycle present.

 Step 2:
 Slow ko head par le aao.
 Ab slow & fast ko 1-1 step chalao.

 Jaha dono milenge → wahi cycle ka starting node.

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_12 {
    public static ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ListNode head = createList(arr);

        head.next.next.next.next = head.next;

        ListNode cycleNode = detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
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
