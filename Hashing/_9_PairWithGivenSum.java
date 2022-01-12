package Hashing;
import java.util.*;

public class _9_PairWithGivenSum {
    public static boolean FindPair(int arr[], int sum){
        HashSet <Integer> h = new HashSet<>();
        for(int i:arr){
            if(h.contains(sum-i))
                return true;
            h.add(i);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={3,2,8,15,-8};
        int sum=17;
        System.out.println(FindPair(arr,sum));
    }
}
