/*
Logic (Reverse Nodes in K Group):

1. Agar head null hai ya k == 1 hai → direct head return (kuch change nahi hoga).

2. Dummy node banaya taki head change hone par bhi easily handle ho jaye.

3. Har group ke liye:
   - Pehle kth node find karte hain (check karne ke liye ki k nodes available hain ya nahi).
   - Agar k nodes nahi mile → break (baaki list same rahegi).

4. Ab group reverse karte hain:
   - prev = nextGroup (jo next group ka start hai)
   - curr = groupStart
   - Jab tak curr nextGroup tak na pahunch jaye:
        next pointer reverse karte jao.

5. Reverse hone ke baad:
   - prevGroup.next = kth (new head of reversed group)
   - prevGroup ko groupStart pe shift kar dete hain (next iteration ke liye)

Time Complexity: O(n)
Space Complexity: O(1)
*/

package e_Linked_List;

public class Solution_23 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        while(true){
            ListNode kth = prevGroup;
            for(int i=0; i<k && kth!=null; i++){
                kth=kth.next;
            }
            if(kth==null) break;
            ListNode groupStart = prevGroup.next;
            ListNode nextGroup = kth.next;

            ListNode prev = nextGroup;
            ListNode curr = groupStart;

            while(curr!=nextGroup){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            prevGroup.next=kth;
            prevGroup=groupStart;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = createList(arr);
        // Test your function
        printList(reverseKGroup(head,2));
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
