/*
 Problem:
 Linked List ki length (total number of nodes) find karni hai.

 Logic:
 - Ek temp pointer ko head par rakho.
 - Jab tak temp null nahi hota:
      count increase karo
      temp ko next node par move karo
 - Jab temp null ho jaye → list end → count return kar do.

 Visual:
 10 -> 20 -> 30 -> null

 Traversal:
 temp moves like:
 10 → 20 → 30 → null

 Count = 3

 Important:
 Linked List me direct size property nahi hoti,
 isliye har node traverse karna padta hai.
*/

package e_Linked_List;
public class Solution_03 {
    public static int getLength(ListNode head) {
        int count=0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
// Test your function
        System.out.println(getLength(head));
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
