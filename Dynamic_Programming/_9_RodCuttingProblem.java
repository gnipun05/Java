package Dynamic_Programming;

public class _9_RodCuttingProblem { // same as _8_UnboundedKnapsack
    
    static int dp[][];

    public static int Knapsack(int ln[], int val[], int length){
        int n=val.length;  // Note: in a ques, length of val might not be equal to length of ln
        dp=new int [n+1][length+1];

        for(int i=0; i<=n; i++)
            for(int j=0; j<=length; j++)
                if(i==0 || j==0)    dp[i][j]=0;
                
        for(int i=1; i<=n; i++){
            for(int j=1; j<=length; j++){
                if(ln[i-1]<=j)    dp[i][j]=Math.max(val[i-1]+dp[i][j-ln[i-1]],dp[i-1][j]);
                else    dp[i][j]=dp[i-1][j]; 
            }
        }

        return dp[n][length];
    }

    public static void main (String args[]){
        int val[]={1,5,8,9,10,17,17,20};
        int length=8; // Note: in a ques, length of val might not be equal to length of ln
        int ln[]=new int[8];
        for(int i=0; i<length; i++)
            ln[i]=i+1;
        System.out.println(Knapsack(ln,val,length));
    }
}