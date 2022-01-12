package Hashing;
import java.util.*;

public class _16_CountDistinctElementsinEveryWindow {
    public static void DistinctElementsinWindow(int arr[],int k){
        HashMap <Integer,Integer> m = new HashMap <>();
        
        for (int i=0; i<k; i++)
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        System.out.println(m.size());

        for(int i=k; i<arr.length; i++){
            if(m.get(arr[i-k])==1)
                m.remove(arr[i-k]);
            else 
                m.put(arr[i-k],m.get(arr[i-k])-1);
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            System.out.println(m.size());
        }
    }
    public static void main (String args[]){
        int arr[]={10,10,5,3,20,5};
        int windowSize=4;
        DistinctElementsinWindow(arr,windowSize);
    }
}
