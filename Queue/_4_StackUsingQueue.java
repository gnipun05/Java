package Queue;

public class _4_StackUsingQueue {
    public static void main (String args[]){
        Stack ob = new Stack();
        ob.push(10);
        ob.push(20);
        System.out.println(ob.pop());
        ob.push(30);
        System.out.println(ob.peek());
        ob.push(40);
        ob.print();
        System.out.println(ob.size());
        System.out.println(ob.isEmpty());
    }
}
