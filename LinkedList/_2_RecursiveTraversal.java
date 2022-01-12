package LinkedList;

public class _2_RecursiveTraversal {

    public static void printList(Node head){
        if(head==null)
            return;
        System.out.println(head.data+" ");
        printList(head.next);
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        printList(head);
    }
}
