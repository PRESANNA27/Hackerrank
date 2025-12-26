import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLinkedLists {
    // Function to merge two sorted linked lists
    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify merging logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge lists while both have elements
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining elements
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next; // Return merged list (excluding dummy node)
    }

    // Function to create a linked list from user input
    public static ListNode createList(Scanner sc, int n) {
        if (n == 0) return null;
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        return head;
    }

    // Function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first sorted linked list
        int n = sc.nextInt();
        ListNode l1 = createList(sc, n);

        // Read second sorted linked list
        int m = sc.nextInt();
        ListNode l2 = createList(sc, m);

        // Merge the two lists
        ListNode mergedHead = mergeLists(l1, l2);

        // Print the merged linked list
        printList(mergedHead);
        
        sc.close();
    }
}
