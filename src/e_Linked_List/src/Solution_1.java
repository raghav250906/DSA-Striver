package e_Linked_List.src;
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
public class Solution_1 {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next=head;
        return newNode;
    }
}
