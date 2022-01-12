package Queue;
import java.util.*;

public class Stack {  // Stack using Queue
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    boolean isEmpty(){
        return (q1.size()==0);
    }

    int peek(){
        return q1.peek();
    }

    int size(){
        return q1.size();
    }

    int pop(){
        return q1.poll();
    }

    void push(int x){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    void print(){
        System.out.println(q1);
    }
}