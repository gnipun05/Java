package LinkedList;

public class _20_MiddleOfLinkedList {

    public static void FindMiddle(Node head){
        if(head==null || head.next==null)  return;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        FindMiddle(head); // finds the second of the 2 middle elements present in linked list of even nodes
    }
}
