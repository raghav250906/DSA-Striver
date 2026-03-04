/*
 Add Two Numbers (Linked List)

 Idea:
 Dono lists ek number represent karti hain.
 Digit by digit add karna hai (with carry).

 Step 1:
 Dummy node banao (easy return ke liye).

 Step 2:
 Jab tak l1, l2 ya carry exist kare:
    sum = carry
    Agar l1 hai → sum += l1.val
    Agar l2 hai → sum += l2.val

    carry = sum / 10
    new node = sum % 10

 Step 3:
 Result list return karo (dummy.next)

 TC: O(max(N, M))
 SC: O(max(N, M))  (new list ban rahi hai)
*/

package e_Linked_List;

public class Solution_22 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while( l1!=null || l2!=null || carry!=0 ){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        ListNode head = createList(arr);
// Test your function

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
