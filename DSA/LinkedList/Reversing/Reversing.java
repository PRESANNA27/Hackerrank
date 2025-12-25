import java.io.*;
import java.util.*;
class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}
class sll{
    Node head;
    Node tail;
    void insertatend(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        
    }
    void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        
        sll s1 = new sll();
        for(int i= 0 ;i<size ;i++){
            String song = sc.nextLine();
            s1.insertatend(song);
        }
        s1.reverse();
        s1.display();
        
    }
}
