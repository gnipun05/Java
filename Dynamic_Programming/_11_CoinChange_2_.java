package Dynamic_Programming;

public class _11_CoinChange_2_ { // Coin change problem: Minimum Number of Coins

    static int dp[][];

    public static int MinNumberofCoins(int coin[], int sum){
        int n=coin.length;
        dp=new int[n+1][sum+1];

        for(int i=0; i<=n; i++)
            dp[i][0]=0;
        
        for(int j=1; j<=sum; j++)
            dp[0][j]=Integer.MAX_VALUE-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(coin[i-1]<=j)
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coin[i-1]] + 1);
                else 
                    dp[i][j]=dp[i-1][j];
            }
        }

        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }

        return dp[n][sum];
    }

    public static void main (String args[]){
        int coin[]={2,1,3};
        int sum=6;
        System.out.println(MinNumberofCoins(coin,sum));
    }
}