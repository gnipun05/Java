package LinkedList;

public class _19_SortedInsert {

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node SortedInsert(Node head,int val){
        if(head==null)  return head;
        Node temp=new Node (val);
        if(head.data>val){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<val){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        head=SortedInsert(head,25);
        printList(head);
    }
}
