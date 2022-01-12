package Stack;


public class MyArrayStack {

    int arr[];
    int cap;
    int top;
    MyArrayStack(int x){
        top=-1;
        cap=x;
        arr=new int [cap];
    }

    void push(int x){
        if(top==cap-1){
            System.out.println("OverFlow");
            return;
        }
        top++;
        arr[top]=x;
    }

    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        top--;
        return arr[top+1];
    }

    int peek(){
        if(top==-1){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        return arr[top];
    }

    int size(){
        return top+1;
    }

    boolean isEmpty(){
        return (top==-1);
    }
}
