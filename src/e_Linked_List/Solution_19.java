/*
 Sort Linked List of 0s, 1s, 2s

 Idea:
 3 dummy lists banao:
 zero list, one list, two list.

 Step 1:
 Har node ko uski value ke hisaab se
 0, 1, ya 2 list me attach karo.

 Step 2:
 End me tino lists ko connect karo:
 zero -> one -> two

 Important:
 Last node ka next null karo
 (warna cycle ban sakta hai)

 Return zeroHead.next

 TC: O(N)
 SC: O(1)
*/

package e_Linked_List;

public class Solution_19 {
    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        ListNode temp = head;
        while(temp != null){
            if(temp.val == 0){
                zero.next=temp;
                zero=zero.next;
            }
            if(temp.val == 1){
                one.next=temp;
                one=one.next;
            }
            if(temp.val == 2){
                two.next=temp;
                two=two.next;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0 , 1};
        ListNode head = createList(arr);
// Test your function
        printList(sortList(head));
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
