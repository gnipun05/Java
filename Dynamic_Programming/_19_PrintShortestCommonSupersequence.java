package Dynamic_Programming;

public class _19_PrintShortestCommonSupersequence {
    public static String findShortestCommonSupersequence(String text1, String text2) {
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
        StringBuffer s=new StringBuffer();
        int j=n, i=m;
        while(j>0 && i>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                s.append(text1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    s.append(text1.charAt(i-1));
                    i--;
                }
                else{
                    s.append(text2.charAt(j-1));
                    j--;
                }
            }
        }
        if(i==0)
            while(j>0){
                s.append(text2.charAt(j-1));
                j--;    
            }
        else if(j==0)
            while(i>0){
                s.append(text1.charAt(i-1));
                i--;
            }
        return s.reverse().toString();
    }
    public static void main (String args[]){
        String text1 = "abcde", text2 = "bcdaegh" ;
        System.out.println(findShortestCommonSupersequence(text1, text2));
    }
}