package LinkedList;

public class _6_DeleteLastNode {

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node delete (Node head){
        if(head==null || head.next==null)
            return head;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head=delete(head);
        printList(head);
    }
}
