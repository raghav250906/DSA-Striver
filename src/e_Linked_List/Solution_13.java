package e_Linked_List;

import java.util.HashMap;

public class Solution_13 {
    public int findLengthOfLoop(ListNode head) {
//        HashMap<ListNode,Integer> map = new HashMap<>();
//        ListNode temp = head;
//        int timer =1;
//        while(temp != null){
//            if(map.containsKey(temp)){
//                int ti = map.get(temp);
//                return timer-ti;
//            }
//            map.put(temp,timer++);
//            temp = temp.next;
//        }
//        return 0;
        if(head == null || head.next == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int length = 1;
                fast = fast.next;
                while(slow != fast){
                    fast = fast.next;
                    length++;
                }
                return length;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ListNode head = createList(arr);

        head.next.next.next.next = head.next;

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
