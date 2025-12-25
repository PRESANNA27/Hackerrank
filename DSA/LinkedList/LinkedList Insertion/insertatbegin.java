import java.io.*;
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
    void insertatbegin(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        SLL s1 = new SLL();
        for(int i = 0;i< size;i++){
            s1.insertatbegin(arr[i]);
        }
        s1.print();
    }
}
