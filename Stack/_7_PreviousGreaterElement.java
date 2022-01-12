package Stack;
import java.util.*;

public  class _7_PreviousGreaterElement {  // Variation of Stock Span Problem

    public static void FindElements(int arr[]){

        Deque <Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        System.out.print(-1+" ");
        for(int i=1; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            int greater = s.isEmpty() ? -1 : s.peek();
            System.out.print(greater+" ");
            s.push(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={20,30,10,5,15};
        FindElements(arr);
    }
}