/*
 Check if Linked List is Palindrome

 Step 1:
 Slow & Fast pointer se middle find karo.

 Step 2:
 Second half ko reverse karo.

 Step 3:
 First half aur reversed half compare karo.
 Agar mismatch → not palindrome.

 Step 4:
 List ko wapas restore kar do (good practice).

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

import java.util.List;

public class Solution_14 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newNode = reverseList(slow.next);
        ListNode first = head;
        ListNode second = newNode;
        while(second!=null){
            if(first.val!=second.val){
                reverseList(newNode);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newNode);
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10};
        ListNode head = createList(arr);
// Test your function
        System.out.println(isPalindrome(head));
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
