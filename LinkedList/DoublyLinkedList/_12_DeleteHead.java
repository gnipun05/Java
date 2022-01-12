package LinkedList.DoublyLinkedList;

public class _12_DeleteHead {
    
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node Delete(Node head){
        if (head==null || head.next==null)  return null;
        head=head.next;
        head.prev=null;
        return head;
    }

    public static void main (String args[]){
        Node head = new Node (10);
        Node temp1 = new Node (20);
        Node temp2 = new Node (30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=Delete(head);
        printList(head);
    }
}
