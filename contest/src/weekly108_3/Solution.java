package weekly108_3;

public class Solution {
    public int minFallingPathSum(int[][] A) {
        int length = A.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[length+1][length+1];
        for(int j = 0;j<length;j++)
            dp[0][j] = A[0][j];
        for(int i = 1;i<length;i++){
            for(int j = 0;j<length;j++){
                if(j == 0)
                    dp[i][j] = A[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
                else if(j == length-1)
                    dp[i][j] = A[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);
                else
                    dp[i][j] = A[i][j]+Math.min(Math.min(dp[i-1][j],dp[i-1][j+1]),dp[i-1][j-1]);
            }
        }
        for(int j = 0;j<length;j++)
            min = min>dp[length-1][j]?dp[length-1][j]:min;

        return min;
    }
}
