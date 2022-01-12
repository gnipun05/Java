package Stack;
import java.util.*;

public class _6_StockSpan {

    public static void printSpan(int arr[]){
        Deque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(1);
        for(int i=1; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(" "+span);
            s.push(i);
        }
    }

    public static void main(String args[]){
        int arr[]={60,10,20,40,35,30,50,70,65};
        printSpan(arr);
    }
}