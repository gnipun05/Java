package Queue;

public class _1_ArrayQueue {  // We are using Circular Array to increase the efficiency of program
    int arr[];
    int front;
    int cap;
    int size;
    _1_ArrayQueue(int c){
        arr=new int[c];
        cap =c;
        size=0;
        front=0;
    }

    boolean isFull(){
        return (size==cap);
    }

    boolean isEmpty(){
        return (size==0);
    }

    int getFront(){
        if(isEmpty())  return -1;
        return front;
    }

    int getRear(){
        if(isEmpty())  return -1;
        return (front+size-1)%cap;
    }

    void enQueue(int x){
        if(isFull())  return;
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
    }

    int deQueue(){
        if(isEmpty())  return Integer.MAX_VALUE;
        int res=arr[front];
        front=(front+1)%cap;
        size--;
        return res;
    }
}
