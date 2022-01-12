package Dynamic_Programming;

public class _1__0_1Knapsack {

    static int dp[][];

    public int Knapsack(int val[],int wt[], int weight, int n){
        for(int i=0; i<=n; i++)
            for(int j=0; j<=weight; j++)
                if(i==0 || j==0)
                    dp[i][j]=0;
 
        for(int i=1; i<=n; i++)
            for(int j=1; j<=weight; j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }

        return dp[n][weight];
    }

    public static void main (String args[]){
        _1__0_1Knapsack ob = new _1__0_1Knapsack();
        int val[]={60,100,120};
        int wt[]={10,20,30};
        int weight=50;
        dp=new int[3+1][weight+1];
        System.out.println(ob.Knapsack(val,wt,weight,3));
    }
}
