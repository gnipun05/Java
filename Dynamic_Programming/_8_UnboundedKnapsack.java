package Dynamic_Programming;

public class _8_UnboundedKnapsack {

    static int dp[][];

    public static int Knapsack(int wt[], int val[], int weight){
        int n=val.length;
        dp=new int [n+1][weight+1];

        for(int i=0; i<=n; i++)
            for(int j=0; j<=weight; j++)
                if(i==0 || j==0)    dp[i][j]=0;
                
        for(int i=1; i<=n; i++){
            for(int j=1; j<=weight; j++){
                if(wt[i-1]<=j)
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j]; 
            }
        }

        return dp[n][weight];
    }

    public static void main (String args[]){
        // int wt[]={1,3,4,5};
        // int val[]={10,40,50,70};
        int wt[]={1,50};
        int val[]={2,30};
        int weight=100; 
        System.out.println(Knapsack(wt,val,weight));
    }
}