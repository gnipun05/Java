package Dynamic_Programming;

public class _4_CountOfSubsetsWithGivenSum {

    static int dp[][];

    public static int  CountSubsets(int arr[], int sum){
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
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j]; // notice the + sign    
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= sum; j++)
                System.out.print (dp[i][j]+" ");
            System.out.println();
        }
        
        return dp[n][sum];
    }

    public static void main (String args[]){
        int arr[]={2,3,1,5,10};
        int sum=10;
        System.out.println(CountSubsets(arr,sum));
    }
}