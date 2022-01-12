package Dynamic_Programming;

public class _3_EqualPartition {
    
    static boolean dp[][];

    public static boolean SubsetExists(int arr[], int sum){
        int n=arr.length;
        dp=new boolean[arr.length+1][sum+1];

        for(int i=0; i<=n; i++)
            for(int j=0; j<=sum; j++){
                if(i==0)    dp[i][j]=false;
                if(j==0)    dp[i][j]=true;
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

    public static boolean Partition(int arr[]){
        int totalSum=0;
        for(int i : arr)
            totalSum+=i;
        if(totalSum%2!=0)   return false;
        else    return SubsetExists(arr, totalSum/2);
    }

    public static void main (String args[]){
        int arr[]={1,5,11,5};
        System.out.println(Partition(arr));
    }
}