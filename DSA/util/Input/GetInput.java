package DSA.util.Input;

import java.util.Arrays;
import java.util.Scanner;

import DSA.util.DataStructure.LinkedList.ListNode;

public class GetInput {
    private static final Scanner inputScanner = new Scanner(System.in);

    //Method to get an integer
    public static int getInt() {
        System.out.println("Enter a number");
        return inputScanner.nextInt();
    }

    //Method to get a String
    public static String getString() {
        System.out.println("Enter a string");
        return inputScanner.nextLine();
    }

    //Method to get an integer array
    public static int[] getIntArray() {
        System.out.println("Enter an array with comma seperated values");

        String input = inputScanner.nextLine();

        return Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    // Method to get a singly linked list
    public static ListNode getSinglyLinkedList() {
        System.out.println("Enter the elements of Linked List with comma separated values");

        String input = inputScanner.nextLine();

        int[] values = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    //Close the input scanner
    public static void closeScanner() {
        inputScanner.close();
    }
}
