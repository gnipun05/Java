package Dynamic_Programming;

public class _25_PalindromePartitioning {
    static int dp[][]=new int[501][501];
    static int palindromicPartition(String str){
        int n=str.length()-1;
        for(int i=0; i<501; i++)
            for(int j=0; j<501; j++)
                dp[i][j]=-1;
        return solve(str, 0, n);
    }
    static int solve(String str, int i, int j){
        if(i>=j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(isPalindrome(str, i, j))
            return 0;
        int minimum=Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int temp=solve(str, i, k) + solve(str, k+1, j) + 1;
            minimum=Math.min(minimum, temp);
        }
        return dp[i][j]=minimum;
    }
    static boolean isPalindrome(String str, int i, int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "ababbbabbababa";
        System.out.println(palindromicPartition(str));
    }
}
