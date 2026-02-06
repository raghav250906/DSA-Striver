/*
 Problem:
 Linked List ko RECURSION se reverse karna hai.

 Intuition:
 Recursion ka matlab -> kaam ko chhote version me todna.

 Hum kya kar rahe?
 Head ko chhod ke baaki list reverse kar rahe,
 fir head ko last me attach kar rahe.

 ------------------------------------------------

 Base Case:
 Agar list empty hai ya sirf 1 node hai,
 toh wahi reversed list hogi.

 if(head == null || head.next == null)
    return head;

 ------------------------------------------------

 Magic Step (Trust Recursion 🪄):

 ListNode newNode = reverseList(head.next);

 Ye line assume karti hai ki
 head ke baad wali poori list reverse ho chuki hai.

 Example:
 1 -> 2 -> 3 -> 4 -> 5

 reverseList(2) return karega:

 5 -> 4 -> 3 -> 2

 Ab bas 1 ko last me lagana hai.

 ------------------------------------------------

 Actual Reverse:

 head.next.next = head;

 Matlab:
 2 ka next ab 1 ban gaya.

 head.next = null;

 Zaroori step ⚠️
 Warna cycle ban jayega:
 1 <-> 2

 ------------------------------------------------

 Return:
 newNode hamesha reversed list ka head hota hai.
 (Yaha 5)

 ------------------------------------------------

 Complexity:

 Time -> O(N)
 Har node ek baar visit hoti hai.

 Space -> O(N)
 Recursive call stack ki wajah se.

 ------------------------------------------------

 Interview Tip ⭐:

 ✔ Iterative approach zyada preferred hoti hai
 kyunki usme space O(1) hota hai.

 ✔ Recursive approach elegant hoti hai
 aur concept clear karti hai.

 Agar interviewer bole:
 "Can you optimize space?"
 👉 Switch to iterative.
*/

package e_Linked_List;

public class Solution_10 {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
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
