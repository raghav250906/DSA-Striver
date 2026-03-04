/*
 Add One to Number (Linked List)

 Problem:
 Linked List ek number represent karti hai.
 Usme +1 add karna hai.

 Trick:
 Number end se add hota hai,
 isliye pehle list reverse karo.

 Step 1:
 List reverse karo.

 Step 2:
 Carry = 1 se start karo.
 Har node me:
   sum = node.val + carry
   node.val = sum % 10
   carry = sum / 10

 Agar carry 0 ho jaye → break.

 Agar last node par bhi carry bacha hai →
 new node add karo.

 Step 3:
 List wapas reverse karo.

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_21 {
    public static ListNode addOne(ListNode head) {
        head = reverse(head);
        int carry=1;
        ListNode temp = head;
        while(temp != null){
            int sum = temp.val + carry;
            carry = sum/10;
            temp.val = sum%10;
            if(carry==0) break;
            if(temp.next==null && carry>0){
                temp.next = new ListNode(carry);
                carry=0;
                break;
            }
            temp = temp.next;
        }
        head=reverse(head);
        return head;
    }

    private static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next= prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ListNode head = createList(arr);
// Test your function
        printList(addOne(head));
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
