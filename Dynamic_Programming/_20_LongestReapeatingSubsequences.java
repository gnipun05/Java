package Dynamic_Programming;

public class _20_LongestReapeatingSubsequences {
    public static int findLongestCommonSubsequence(String text1, String text2) {
        int m=text1.length(), n=text2.length();
        int dp[][]= new int[m+1][n+1];
        for(int i=0; i<=m ;i++)
            dp[i][0]=0;
        for(int i=0; i<=n ;i++)
            dp[0][i]=0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i!=j && text1.charAt(i-1)==text2.charAt(j-1))  // only difference is i!=j
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public static void main (String args[]){
        String text1 = "aabebcdd" ;
        System.out.println(findLongestCommonSubsequence(text1, text1));
    }
}
