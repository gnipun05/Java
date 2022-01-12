package Dynamic_Programming;

public class _2_SubsetSumProblem {

    boolean dp[][]; 

    public boolean SubsetExists(int arr[], int sum){
        int n=arr.length;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;

            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
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
        _2_SubsetSumProblem ob = new _2_SubsetSumProblem();
        int arr[]={4,1,1,2,5,3};
        int sum=16;
        ob.dp=new boolean[arr.length+1][sum+1];
        System.out.println(ob.SubsetExists(arr,sum));
    }
}