/*
Problem: Multi-level linked list (next + child) ko flatten karke
ek single sorted list banana hai (child pointer use hoga).

Logic:

1. Base Case:
   Agar head null hai ya ek hi node hai → already flat.

2. Recursive Approach:
   - Right side (head.next) ko pehle flatten karo.
   - mergedHead = flattenLinkedList(head.next)

3. Merge Step:
   - Current list (head se child wali) ko
     flattened right list ke saath merge karo.
   - Merge sorted linked list jaisa (child pointer use hoga).

4. Important:
   - Merge ke time next pointer = null karna hai
     kyunki final list sirf child se connected hogi.

Time Complexity: O(N * M) approx
Space Complexity: O(N) recursion stack
*/

package e_Linked_List;

public class Solution_25 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode child;

        ListNode() {
            val = 0;
            next = null;
            child = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
            child = null;
        }

        ListNode(int data1, ListNode next1, ListNode child1) {
            val = data1;
            next = next1;
            child = child1;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }

        if (list1 != null) res.child = list1;
        else res.child = list2;

        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }

    // Flatten a multi-level linked list
    public static ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mergedHead = flattenLinkedList(head.next);
        return merge(head, mergedHead);
    }
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print original linked list in grid format
    public static void printOriginalLinkedList(ListNode head, int depth) {
        while (head != null) {
            System.out.print(head.val);

            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(10);
        head.next.child = new ListNode(4);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(20);
        head.next.next.child.child = new ListNode(13);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        // Print original structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten list
        ListNode flattened = flattenLinkedList(head);

        // Print flattened version
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}
