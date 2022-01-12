package LinkedList.DoublyLinkedList;

public class _11_ReverseDoublyLinkedList{
    
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node Reverse(Node head){
        if (head==null || head.next==null)  return head;
        Node curr = head, previous=null;
        while(curr!=null){
            previous=curr.prev;
            curr.prev=curr.next;
            curr.next=previous;

            curr=curr.prev; // to move curr in forward direction
        }
        return previous.prev;
    }

    public static void main (String args[]){
        Node head = new Node (10);
        Node temp1 = new Node (20);
        Node temp2 = new Node (30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=Reverse(head);
        printList(head);
    }
}