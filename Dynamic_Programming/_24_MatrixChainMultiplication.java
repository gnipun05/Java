package Dynamic_Programming;

public class _24_MatrixChainMultiplication {
    static int dp[][]= new int[101][101];
    static int matrixMultiplication(int N, int arr[])
    {
        int i=1;
        int j=N-1;
        for(int x=0; x<101;x++)
            for(int y=0; y<101; y++)
                dp[x][y]=-1;
        return solve(arr, i, j);
    }
    static int solve (int arr[], int i, int j){
        if(i>=j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int minimum=Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int temp=solve(arr, i, k) + solve(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
            minimum=Math.min(temp, minimum);
        }
        return dp[i][j]=minimum;
    }
    public static void main (String args[]){
        int n=5;
        int arr[]={40, 20, 30, 10, 30};
        System.out.println(matrixMultiplication(n, arr));
    }
}   