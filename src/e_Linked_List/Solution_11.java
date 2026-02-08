/*
 Problem:
 Linked List me cycle (loop) hai ya nahi check karna hai.

 Cycle matlab:
 Last node ka next kisi previous node ko point kare.

 Example:
 10 -> 20 -> 30 -> 40 -> 50
              ↑________|

------------------------------------------------

 Approach: Floyd’s Cycle Detection (Tortoise & Hare Algorithm)

 Hum 2 pointers use karte hain:

 👉 slow -> 1 step chalega
 👉 fast -> 2 step chalega

 Agar cycle hogi,
 fast pointer slow ko pakad lega.

 Agar cycle nahi hogi,
 fast NULL tak pahunch jayega.

------------------------------------------------

 Edge Case:
 Agar head null hai ya sirf 1 node hai,
 cycle possible nahi.

 if(head==null || head.next==null)
    return false;

------------------------------------------------

 Logic:

 while(fast != null && fast.next != null){

    slow = slow.next;        // 1 step
    fast = fast.next.next;   // 2 step

    if(slow == fast)
        return true; // Cycle mil gayi
 }

 Loop khatam -> fast null
 Matlab cycle nahi hai.

 return false;

------------------------------------------------

 Visualization (Important 🧠):

 Imagine circular race track.

 Fast runner tez hai,
 slow runner dheere.

 Agar track circular hai,
 fast runner slow ko zaroor overtake karega.

 Agar track straight hai,
 fast bahar nikal jayega.

------------------------------------------------

 Complexity:

 Time -> O(N)
 (Worst case me poori list traverse hogi)

 Space -> O(1)
 (Koi extra memory nahi use hui 👍)

------------------------------------------------

 Interview Tip ⭐ (VERY IMPORTANT):

 Agar interviewer bole:

 👉 "Cycle detect ho gayi, ab starting node batao"

 Tab bhi same algorithm use hota hai!

 Step:
 Meeting point ke baad,
 ek pointer head par rakho,
 dono ko 1 step chalao.

 Jaha milenge -> wahi cycle ka start.

 VERY frequently asked 🔥
*/

package e_Linked_List;

public class Solution_11 {
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ListNode head = createList(arr);

        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
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
