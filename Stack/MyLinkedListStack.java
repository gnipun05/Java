package Stack;

public class MyLinkedListStack {
    
    Node head;
    int size;
    
    MyLinkedListStack(){
        head=null;
        size=0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return (size==0);
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }

    int pop(){
        if(head==null){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    int peek(){
        if(head==null){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}