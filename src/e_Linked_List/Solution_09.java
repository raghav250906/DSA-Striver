/*
 Problem:
 Singly Linked List ko reverse karna hai.

 Intuition:
 Har node ka next pointer ulta karna hai.
 Matlab jo aage point kar raha tha,
 ab peeche point karega.

 Logic:
 Hum 3 pointers use karte hain:

 prev -> initially null (kyunki new tail null pe point karegi)
 temp -> head (current node)
 next -> temp.next store karne ke liye (warna list lose ho jayegi)

 Steps:
 1. next = temp.next   (backup lelo)
 2. temp.next = prev   (link reverse karo)
 3. prev = temp        (prev ko aage badhao)
 4. temp = next        (current ko move karo)

 Ye tab tak repeat karo jab tak temp null na ho jaye.

 Dry Run:
 Original:
 1 -> 2 -> 3 -> 4 -> 5 -> null

 After reverse:
 null <- 1 <- 2 <- 3 <- 4 <- 5

 New Head = prev (last node)

 Important:
 Head change ho jata hai,
 isliye return prev karte hain.

 Complexity:
 Time -> O(N)  (ek traversal)
 Space -> O(1) (in-place reversal)

 Interview Tip ⭐:
 Recursive solution bhi hota hai,
 BUT iterative zyada preferred hai
 kyunki space efficient hai.
*/

package e_Linked_List;

public class Solution_09 {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = createList(arr);
// Test your function
        printList(reverseList(head));
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
