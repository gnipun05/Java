package LinkedList;

public class _3_InsertAtBeginning {

    public static Node insert(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        return temp;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head=insert(head,40);
        printList(head);
    }
}
