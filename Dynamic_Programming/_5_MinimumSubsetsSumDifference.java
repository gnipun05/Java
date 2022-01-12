package Dynamic_Programming;

import java.util.*;

public class _5_MinimumSubsetsSumDifference {

    static boolean dp[][];

    public static ArrayList<Integer> SubsetSum(int arr[],int sum){
        int n=arr.length;
        dp=new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)    dp[i][j]=false;
                if(j==0)    dp[i][j]=true;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }

        ArrayList<Integer> store = new ArrayList<>();
        for(int j=1; j<=sum/2; j++){
            if(dp[n][j])
                store.add(j);
        }
        
        return store;
    }

    public static int MinimumDifference(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];

        ArrayList<Integer> store = SubsetSum(arr,sum);
        int minimum=Integer.MAX_VALUE;
        for(int i : store)  
            minimum=Math.min(minimum,sum-(2*i));

        return minimum;
    }

    public static void main (String args[]){
        int arr[]={100000};//{1,11,6,5};
        System.out.println(MinimumDifference(arr));
    }
}