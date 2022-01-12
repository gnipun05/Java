package LinkedList;

public class _21_NthNodeFromEnd {
    
    public static void NodeFromEnd(Node head, int n){
        if(head==null)  return;
        Node pos1=head;
        Node pos2=head;
        for(int i=0; i<n; i++){
            if(pos2==null) return;
            pos2=pos2.next;
        }
        while(pos2!=null){
            pos2=pos2.next;
            pos1=pos1.next;
        }
        System.out.println(pos1.data);
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        NodeFromEnd(head,2); // finds the second of the 2 middle elements present in linked list of even nodes
    }
}
