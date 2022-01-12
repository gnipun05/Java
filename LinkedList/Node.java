package LinkedList;

class Node{  
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null; // this step is optional, because in Java a member is by default initialised as null
    }
}