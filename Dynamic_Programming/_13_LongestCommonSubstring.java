package Dynamic_Programming;

public class _13_LongestCommonSubstring {
    public static int findLongestCommonSubstr(String text1, String text2, int m, int n){
        int answer=0;
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
                    dp[i][j]=0;
                answer=Math.max(answer, dp[i][j]);
            }
        }
        return answer;
    }
    public static void main(String args[]){
        String text1 = "abcde", text2 = "abce" ;
        System.out.println(findLongestCommonSubstr(text1, text2, text1.length(), text2.length()));
    }
}