package Stack;

public class _3_LinkedListImplementationOfStack {
    public static void main(String[] args){
        MyLinkedListStack s = new MyLinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
