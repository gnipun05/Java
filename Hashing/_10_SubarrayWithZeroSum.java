package Hashing;
import java.util.*;

public class _10_SubarrayWithZeroSum {
    public static boolean FindSubarray(int arr[]){
        HashSet <Integer> h = new HashSet<>();
        int currsum=0;
        h.add(currsum);
        for(int i:arr){
            currsum+=i;
            if(h.contains(currsum))
                return true;
            h.add(currsum);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,4,13,-3,-10,5};
        System.out.println(FindSubarray(arr));
    }
}
