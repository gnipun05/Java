package Hashing;
import java.util.*;

public class _15_LongestConsecutiveSubsequence {
    public static int FindSubsequence(int arr[]){
        HashSet <Integer> h = new HashSet<>();

        for(int i:arr)
            h.add(i);
        
        int res=1;
        for(Integer x:h){  // total 2n traversal will take place {two loops combined}
            if(!h.contains(x-1)){
                int count=1;
                while(h.contains(x+count))
                    count++;
                res=Math.max(res,count);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,3,9,2,8,2};
        System.out.println(FindSubsequence(arr));
    }
}