package LinkedList;

public class _7_InsertAtGivenPosition {

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node Insert (Node head, int pos, int val){
        Node temp = new Node(val);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        while(pos>2 && curr!=null){
            curr=curr.next;
            pos--;
        }
        if(curr==null)
            return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head=Insert(head,2,80);
        printList(head);
    }
}
