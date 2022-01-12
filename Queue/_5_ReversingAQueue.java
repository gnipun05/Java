package Queue;
import java.util.*;

public class _5_ReversingAQueue {
    
    public void reverseIterative(Queue<Integer> q){
        Deque<Integer> s = new ArrayDeque<>();
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.offer(s.pop());
        }
    }

    public void reverseRecursive(Queue<Integer> q){
        if(q.isEmpty())
            return ;
            int res=q.poll();
            reverseRecursive(q);
            q.offer(res);
        }
}