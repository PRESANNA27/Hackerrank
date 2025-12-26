import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class SegregateEvenOddLinkedList {
    public static ListNode segregateEvenOdd(ListNode head) {
        if (head == null) return null;
        ListNode evenHead = null, evenTail = null;
        ListNode oddHead = null, oddTail = null;
        ListNode current = head;
        while (current != null) {
            if (current.val % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else { 
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
        return evenHead;
    }
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
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        ListNode head = createList(sc, n);
        ListNode newHead = segregateEvenOdd(head);
        printList(newHead);
        sc.close();
    }
}
