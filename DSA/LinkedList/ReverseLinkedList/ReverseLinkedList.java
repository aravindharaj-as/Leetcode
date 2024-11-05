package DSA.LinkedList.ReverseLinkedList;

import DSA.util.DataStructure.LinkedList.ListNode;
import DSA.util.Input.GetInput;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = GetInput.getSinglyLinkedList();
        ListNode reversedList = reverseLinkedList(head);

        while(reversedList != null) {
            System.out.print(reversedList.value);

            if(reversedList.next != null) {
                System.out.print("->");
            }

            reversedList = reversedList.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
