package Dynamic_Programming;

public class _7_TargetSum { // Exactly same as _6_NumberofSubsetswithGivenDifference
    
    static int dp[][];

    public static int CountSubsetSum(int arr[],int sum){
        int n=arr.length;
        dp=new int[n+1][sum+1];
        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<=sum; j++){
        //         if(i==0)    dp[i][j]=0;
        //         if(j==0)    dp[i][j]=1;
        //     }
        // }
        for(int i=1; i<=sum; i++) // for arr = [0,0,0,0,0,0,0,0,1] and target 1 it is necessary to initialise dp like this
            dp[0][i]=0;
        dp[0][0]=1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        
        return dp[n][sum];
    }


    public static int TargetSum(int arr[], int req_sum){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];
        if((sum+req_sum)%2==1)
            return 0;
        int SumOfAllPositiveSignedNumbers=(sum+req_sum)/2;
        return CountSubsetSum(arr, SumOfAllPositiveSignedNumbers);
    }

    public static void main (String args[]){
        int arr[]={1,2,1,3};
        int req_sum=1;
        System.out.println(TargetSum(arr,req_sum));
    }
}