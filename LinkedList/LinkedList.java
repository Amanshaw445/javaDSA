import java.util.*;
class LinkedList {

    public static class Node{        //We are defining a new class called Node, which represents one node of a linked list.
        int data;
        Node next;
        public Node(int data){       //This is a constructor that initializes a newly created Node. It assigns the given value to data and initializes next to null.
            this.data = data;
            this.next = null;
        }
}
    static Node head;

public static void print(Node head){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
}

static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
}

static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        if(temp.next == null){ // if linkedlist is empty add pointer the node to head
            head = newNode;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
}

static void insertInto(int position, int data){

    if (position == 1){
        addFirst(data);
        return;
    }
    Node temp = head;
    for(int i=1; i<position-1; i++){
        temp = temp.next;
    }
    Node newNode = new Node(data);
    newNode.next = temp.next;
    temp.next = newNode;
}

static void deleteFirst(){
    if(head == null){
        return;
    }
    head = head.next;
}

static void deleteLastNode(){
    if(head == null){
        return;
    }
    if(head.next == null){
        head = null;
        return;
    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
}

static void deleteAtPosition(int position){
    if(head == null){
        return;
    }
    if(position == 0){
        deleteFirst();
        return;
    }
    Node temp = head;
    for(int i=0; i<position - 1; i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
}

static int size (){
    int count = 0;
    Node temp = head;

    while(temp != null){
        count++;
        temp = temp.next;
    }return count;
}

public void reverseNode(){

}

public static Node findMidNode(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
    }
    return slow; // this is the mid node
}

static boolean checkPalindrome(){
    if(head == null && head.next == null){
        return false;
    }
    // Step 1- find the middle
    Node midNode = findMidNode(head);
    // Step 2- reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;// new head of roght half
    Node left = head;

    // Step 3- check left half & right half
    while(right != null){
        if(left.data != right.data) {
            return false;

        }   left = left.next;
            right = right.next;
    }return true;
}



public static void main(String[] args) {
    head = new Node(10);
    head.next = new Node(20);
    head.next.next= new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    insertInto(4,3);
    print(head);
    deleteFirst();
    print(head);
    System.out.println (checkPalindrome());
    }
}