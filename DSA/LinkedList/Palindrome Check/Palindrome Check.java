import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SLL{
    Node head;
    Node tail;
    void insertionatend(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
}
class Solution{
    public static boolean ispal(Node head){
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        List<Integer> rev = new ArrayList<>(list);
        Collections.reverse(rev);
        return list.equals(rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL sll = new SLL();
        for(int i=0;i<n;i++){
            sll.insertionatend(sc.nextInt());
        }
        if(ispal(sll.head)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
