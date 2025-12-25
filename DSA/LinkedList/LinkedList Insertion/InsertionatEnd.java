import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}
class SLL{
    Node head;
    Node tail;
    void insertatend(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    void print(){
        Node temp = head ; 
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
} 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        SLL s1 = new SLL();
        for(int i = 0;i<n;i++){
        s1.insertatend(arr[i]);
        }
            s1.print();
    }
}
