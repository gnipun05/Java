package LinkedList;

public class _8_SearchInLinkedList {

    public static int IterativeSearch (Node head, int val){
        int res=0;
        Node curr=head;
        while(curr!=null){
            res++;
            if(curr.data==val)
                return res;
            else
                curr=curr.next;
        }
        return 1;
    }

    public static int RecursiveSearch (Node head, int val){
        if(head==null)
            return -1;
        if (head.data==val)
            return 1;
        int res = RecursiveSearch(head.next, val);
        if(res==-1) return -1;
        else return res+1;
    }

    public static void main (String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        System.out.println(RecursiveSearch(head,300)); // prints -1 if not found, else the position of value
        System.out.println(IterativeSearch(head,100));
    }
}
