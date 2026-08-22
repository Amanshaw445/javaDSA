import java.util.*;

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }




    public static void main(String[] args){
    Node head = new Node(101);
    Node second = new Node(202);
    Node third = new Node(303);

    head.next = second;
    second.next = third;

    // now comes the printing part
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}