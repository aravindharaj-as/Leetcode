package DSA.util.DataStructure.LinkedList;

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode () {}

    public ListNode (int value) {
        this.value = value;
        this.next = null;
    }

    public ListNode (int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
