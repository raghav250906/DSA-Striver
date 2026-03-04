/*
 Problem:
 Linked List me check karna hai ki given key exist karti hai ya nahi.

 Logic:
 - Ek temp pointer ko head par rakho.
 - Jab tak temp null nahi hota:
      agar temp.val == key → return true
      warna next node par move karo.
 - Agar poori list traverse ho gayi aur key nahi mili → return false.

 Visual:
 10 -> 20 -> 30 -> null

 Key = 20

 Traversal:
 10 ❌
 20 ✅ → return true

 Important:
 Linked List me binary search possible nahi hota
 kyunki random access nahi hota.
 Isliye hamesha linear traversal karna padta hai.
*/

package e_Linked_List;
public class Solution_04 {
    public static boolean searchKey(ListNode head, int key) {
        ListNode temp=head;
        while(temp != null){
            if(temp.val == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
        System.out.println(searchKey(head, 20));
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
