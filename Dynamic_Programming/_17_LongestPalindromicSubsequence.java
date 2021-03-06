// Remember
// Like we can use Longest Common Subsequence method to find Longest Common Substring
// We cant use Longest Palindromic Subsequence to find the Longest Palindromic SUBSTRING


package Dynamic_Programming;

public class _17_LongestPalindromicSubsequence {
    public static int findLongestCommonSubsequence(String text1, String text2) {
        int m=text1.length(), n=text2.length();
        int dp[][]= new int[m+1][n+1];
        for(int i=0; i<=m ;i++)
            dp[i][0]=0;
        for(int i=0; i<=n ;i++)
            dp[0][i]=0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public static void main (String args[]){
        String text1 = "agbcba";
        StringBuffer s= new StringBuffer(text1);
        String text2 = s.reverse().toString();
        System.out.println(findLongestCommonSubsequence(text1, text2)); // this will return value 5 for subsequence abcba
    }
}
