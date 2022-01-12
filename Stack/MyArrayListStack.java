package Stack;
import java.util.ArrayList;

public class MyArrayListStack {
    ArrayList <Integer> al = new ArrayList<>();
    
    void push(int x){
        al.add(x);
    }

    int pop(){
        if(al.size()==0){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    int peek(){
        if(al.size()==0){
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        int res=al.get(al.size()-1);
        return res;
    }

    int size(){
        return al.size();
    }

    boolean isEmpty(){
        return (al.size()==0);
    }
}
