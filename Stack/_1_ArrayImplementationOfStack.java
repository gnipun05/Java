package Stack;

public class _1_ArrayImplementationOfStack {    
    public static void main(String[] args){
        MyArrayStack s = new MyArrayStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}