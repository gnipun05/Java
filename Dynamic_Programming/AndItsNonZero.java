/* Codeforces Global Round 18
 You are given an array consisting of all integers from [l,r] inclusive. For example, if l=2 and r=5, the array would be [2,3,4,5].
 What's the minimum number of elements you can delete to make the bitwise AND of the array non-zero? 
 1 ≤ l ≤ r ≤ 2⋅105   */

package Dynamic_Programming;

import java.io.*;
import java.util.*;

public class AndItsNonZero{
    static int dp[][]=new int[20][200001];
    public static void main (String args[]) throws IOException{
        for(int i=0; i<20; i++)
            dp[i][0]=0;     // smallest possible value of l is 1
        for(int i=0; i<20; i++){
            for(int j=1; j<=200000; j++){
                dp[i][j]=dp[i][j-1]+(~(j>>i)&1);
            }
        }
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(ob.readLine());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            int answer=Integer.MAX_VALUE;
            for(int i=0; i<20; i++){
                answer=Math.min(answer, dp[i][r]-dp[i][l-1]);
            }
            System.out.println(answer);
        }
    }
}
/* #include <bits/stdc++.h>
using namespace std;
 
const int N = 1e6 + 5;
int T, n, l, r, S[20][N];
void m() {
	cin >> l >> r;
	int ans = 1e9;
	for(int i = 0; i < 20; ++ i) {
		ans = min(ans, S[i][r] - S[i][l - 1]);
	}
	cout << ans << endl;
}
 
int main() {
	for(int t = 0; t < 20; ++ t) {
		for(int i = 1; i < N; ++ i)
		S[t][i] = (S[t][i - 1] + (!((i >> t) & 1)));
	}
	int c;
	for(cin >> c; c --;) m();
} */