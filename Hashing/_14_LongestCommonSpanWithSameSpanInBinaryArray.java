package Hashing;
import java.util.*;

public class _14_LongestCommonSpanWithSameSpanInBinaryArray {
    public static int FindSubarray(int arr[]){
        HashMap <Integer,Integer> m = new HashMap<>();              
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
        int arr1[]={0,1,0,0,0,0};
        int arr2[]={1,0,1,0,0,1};
        int temp[]=new int[arr1.length];
        for(int i=0; i<arr1.length; i++)
            temp[i]=arr1[i]-arr2[i];
        System.out.println(FindSubarray(temp));
    }
}
