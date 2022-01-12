package Stack;
// import java.util.Stack;
import java.util.ArrayDeque;

public class _4_IntroductionToStack {
    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>(); // We can also use this statement to execute Stack in java {This belongs to list Collection}
        ArrayDeque<Integer> s = new ArrayDeque<>(); // {This belongs to Queue Collection} [Better when not working on MultiThreaded env.]
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop()); // removes topmost element but also returns its value
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty()); // return true if empty
    }
}
