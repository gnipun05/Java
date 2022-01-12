package LinkedList.CircularLinkedList;

public class _15_InsertAtBeginning {

    public static Node Insert(Node head, int val){
        Node temp=new Node(val);
        if(head==null){ 
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
        }
        return head;
    }
    
    public static void printList(Node head){
        if(head==null) return;
        Node curr=head;
        do{
            System.out.println(curr.data);
            curr=curr.next;
        }
        while(curr!=head);
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head=Insert(head,50);
        printList(head);
    }
}
