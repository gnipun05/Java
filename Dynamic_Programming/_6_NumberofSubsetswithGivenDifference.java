package Dynamic_Programming;

public class _6_NumberofSubsetswithGivenDifference {
    
    static int dp[][];

    public static int CountSubsetSum(int arr[],int sum){
        int n=arr.length;
        dp=new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)    dp[i][j]=0;
                if(j==0)    dp[i][j]=1;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        
        return dp[n][sum];
    }


    public static int SubsetsofGivenDifference(int arr[], int diff){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];
        int _1stSubsetSum=(sum+diff)/2;
        return CountSubsetSum(arr, _1stSubsetSum);
    }

    public static void main (String args[]){
        int arr[]={1,2,1,3};
        int diff=1;
        System.out.println(SubsetsofGivenDifference(arr,diff));
    }
}