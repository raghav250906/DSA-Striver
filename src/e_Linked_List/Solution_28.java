/*
Problem: Sorted Doubly Linked List me aise pairs find karne hain
jin ka sum = target ho.

Logic (2 Pointer Approach):

1. Initialize pointers:
   - low = head (start se)
   - high = last node (end se)

2. Loop jab tak low < high:
   - sum = low.data + high.data

   Case 1: sum == target
       → pair add karo
       → low++, high--

   Case 2: sum > target
       → high-- (sum kam karo)

   Case 3: sum < target
       → low++ (sum badhao)

3. Stop jab pointers cross ho jaye.

Time Complexity: O(N)
Space Complexity: O(1) (excluding result list)
*/

package e_Linked_List;

import java.util.*;
public class Solution_28 {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, ListNode head) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if(head == null) return list;

        ListNode low = head;
        ListNode high = head;

        while(high.next != null){
            high = high.next;
        }

        while(low != high && high.next != low){

            int sum = low.data + high.data;

            if(sum == target){
                list.add(new ArrayList<>(Arrays.asList(low.data, high.data)));
                low = low.next;
                high = high.prev;
            }
            else if(sum > target){
                high = high.prev;
            }
            else{
                low = low.next;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        ListNode head = createList(arr);
        // Test function here

    }

    static class ListNode {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // Create DLL from array
    public static ListNode createList(int[] arr) {

        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    // Print forward
    public static void printForward(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    public static void printBackward(ListNode head) {

        if (head == null) return;

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}
