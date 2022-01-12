package Queue;

public class _2_LinkedListQueue {
    Node front;
    Node rear;
    int size;
    _2_LinkedListQueue(){
        front = null;
        rear = null;
        size=0;
    }

    void enQueue(int x){
        Node temp =  new Node(x);
        if(front==null){
            front = rear = temp;
        }
        rear.next=temp;
        rear=temp;
        size++;
    }

    int deQueue(){
        if(front==null)  return Integer.MAX_VALUE;
        int res=front.data;
        front = front.next;
        size--;
        if(front == null)  rear=null;
        return res;
    }

    int getSize(){
        return size;
    }

    int getFront(){
        if(front==null)  return Integer.MAX_VALUE;
        return front.data;
    }

    int getRear(){
        if(front==null)  return Integer.MAX_VALUE;
        return rear.data;
    }
}