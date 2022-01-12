package Queue;
import java.util.*;

public class _3_IntroductionToQueue {
    public static void main(String args[]){
        // Queue<Integer> q = new LinkedList<>(); // Queue can also be created using this
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); // if capacity of capacity bounded Queue is fuul, it returns false; else true
        q.offer(20);
        q.offer(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.peek());  // returns null if the Queue is Empty; else front element
        System.out.println(q.poll());  // returns null if the Queue is Empty; else front element and removes it from Queue
        System.out.println(q.peek());  
    }
}
