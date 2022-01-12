package Stack;

public class _2_ArrayListImplementationOfStack {
    public static void main(String[] args){
        MyArrayListStack s = new MyArrayListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
