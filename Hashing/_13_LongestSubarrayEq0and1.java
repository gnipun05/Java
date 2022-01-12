package Hashing;
import java.util.*;

public class _13_LongestSubarrayEq0and1 {
    public static int FindLongestSubarray(int arr[]){
        HashMap <Integer,Integer> m = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
            if(arr[i]==0)
                arr[i]=-1;

        int res=0;
        int count=1;
        int currsum=0;
        m.put(0,0);
        for(int i:arr){
            currsum+=i;
            if(!m.containsKey(currsum))
                m.put(currsum,count);
            if(m.containsKey(currsum-0))
                res=Math.max(res,count-m.get(currsum-0));
            count++;
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,0,1,1,1,0,0};
        //int arr[]={1,0};  
        System.out.println(FindLongestSubarray(arr));
    }
}
