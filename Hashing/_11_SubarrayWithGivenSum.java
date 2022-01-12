package Hashing;
import java.util.*;

public class _11_SubarrayWithGivenSum {
    public static boolean FindSubarray(int arr[], int sum){
        HashSet <Integer> h = new HashSet<>();
        int currsum=0;
        h.add(currsum);
        for(int i:arr){
            currsum+=i;
            if(h.contains(currsum-sum))
                return true;
            h.add(currsum);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={5,3,2,-1};
        int sum=4;
        System.out.println(FindSubarray(arr,sum));
    }
}
