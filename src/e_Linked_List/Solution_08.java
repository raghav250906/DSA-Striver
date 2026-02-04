/*
 Problem:
 Linked List ka middle node find karna hai.

 Best Logic (Slow & Fast Pointer):
 - Slow pointer 1 step move karega.
 - Fast pointer 2 step move karega.

 Jab fast end tak pahuch jayega,
 slow automatically middle par hoga.

 Why it works?
 Fast double speed se travel karta hai,
 isliye jab fast list finish karega,
 slow exactly half distance cover karega.

 Example:
 1 -> 2 -> 3 -> 4 -> 5 -> 6

 Iteration:
 slow=1, fast=1
 slow=2, fast=3
 slow=3, fast=5
 slow=4, fast=null

 Middle = 4

 NOTE:
 Agar nodes even ho,
 ye approach SECOND middle return karti hai.
 (Interviews me mostly ye hi expected hota hai)

 Important Pattern:
 Ye technique bahut jagah use hoti hai:
 - Detect cycle in Linked List
 - Find middle
 - Check palindrome
 - Split list

 Complexity:
 Time -> O(N)
 (Sirf ek traversal)

 Space -> O(1)
 (No extra memory)
*/

package e_Linked_List;
public class Solution_08 {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = createList(arr);
        // Test your function
        printList(middleNode(head));
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
