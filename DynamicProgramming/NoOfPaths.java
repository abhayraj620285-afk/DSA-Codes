package DynamicProgramming;

import java.util.Arrays;

public class NoOfPaths {
    public int numberOfPaths(int m,int n){
        int[][] dp = new int[m+1][n+1];
        for(int[] arr : dp){
            Arrays.fill(arr,1);
        }

        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
    // SPACE OPTIMIZED TABULATION
    public int numberOfPaths02(int m,int n){
        int[][] dp = new int[2][n];
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        dp[1][0] = 1;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n;j++){
                dp[1][j] = dp[0][j]+dp[1][j-1];
            }
            for(int k=1;k<n;k++){
                dp[0][k] = dp[1][k];
            }
        }
        return dp[1][n-1];
    }
}