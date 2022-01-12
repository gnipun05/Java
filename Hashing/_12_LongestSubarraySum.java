package Hashing;

import java.util.HashMap;

public class _12_LongestSubarraySum {
    public static int FindLongestSubaray(int arr[], int sum){
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,0); // adding this case, just in case if 1st n numbers give us the 
        int res=0; // to store the maximum final result i.e. the maximum length of a Subarray
        int currsum=0;  // calculates the sum of sum of numbers as the for loop proceeds
        int count=1; // this tells the number of numbers added into currsum 
        for (int i:arr){
            currsum+=i;
            if(!m.containsKey(currsum))
                m.put(currsum,count);
            if(m.containsKey(currsum-sum))
                res=Math.max(res,count-m.get(currsum-sum));
            count++; // incrementing count for the other round of for 
        }
        return res;
    }
    public static void main(String args[]){
        // int arr[]={8,3,1,5,-6,6,2,2}; // answer is 4
        // int sum = 4;
        int arr[]={5,2,3}; // answer is 2
        int sum=5;
        System.out.println(FindLongestSubaray(arr,sum));
    }
}
