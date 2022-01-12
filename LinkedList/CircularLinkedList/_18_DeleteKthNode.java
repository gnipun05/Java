package LinkedList.CircularLinkedList;

public class _18_DeleteKthNode {

    public static Node DeleteKth(Node head, int k){
        if(head==null) return null;
        if (k==1) return DeleteHead(head);
        Node curr=head;
        while(k>2){
            curr=curr.next;
            k--;
        }
        curr.next=curr.next.next;
        return head;
    }
    
    public static Node DeleteHead(Node head){
        if((head==null)||(head.next==head)) return null;
        head.data=head.next.data;
        head.next=head.next.next;
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
        head=DeleteKth(head,2);
        printList(head);
    }
}
