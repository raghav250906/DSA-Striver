// Linked List Template for IDE

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