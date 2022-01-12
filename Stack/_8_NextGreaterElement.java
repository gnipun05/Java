package Stack;
import java.util.*;

public class _8_NextGreaterElement { // it is a variation of Stock span problem
    
    // public static void FindElements(int arr[]){
    //     Deque <Integer> s = new ArrayDeque<>();
    //     int n=arr.length;
    //     s.push(arr[n-1]);
    //     System.out.print(-1+" ");
    //     for(int i=n-2; i>=0; i--){
    //         while(!s.isEmpty() && arr[i]>=s.peek()){
    //             s.pop();
    //         }
    //         int greater = s.isEmpty() ? -1 : s.peek();
    //         System.out.print(greater+" ");
    //         s.push(arr[i]);
    //     }
    // }

    // public static void main(String args[]){
    //     int arr[]={5,15,10,8,6,12,9,18};
    //     FindElements(arr); // Prints output in reverse order
    // }

    public static ArrayList<Integer> FindElements(int arr[]){
        Deque <Integer> s = new ArrayDeque<>();
        ArrayList<Integer> al = new ArrayList<>();
        int n=arr.length;
        s.push(arr[n-1]);
        al.add(-1);
        for(int i=n-2; i>=0; i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            int greater = s.isEmpty() ? -1 : s.peek();
            al.add(greater);
            s.push(arr[i]);
        }
        Collections.reverse(al);  // function to reverse the ArrayList
        return al;
    }

    public static void printArrayList(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++)
            System.out.print(al.get(i)+" ");
    }

    public static void main(String args[]){
        int arr[]={5,15,10,8,6,12,9,18};
        ArrayList<Integer> al = new ArrayList<>();
        al=FindElements(arr);
        printArrayList(al);
    }
}