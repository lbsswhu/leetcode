package codility1702;

/**
 * Create by lbsswhu
 * date 18/09/02
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length ==0)
            return 0;
        int[] count = new int[101];
        int sum = 0;
        int count_long = 0;

        for(int i = 0;i<A.length;i++){
            if(A[i] == 0)
                continue;
            if(count[Math.abs(A[i])] == 0)
                count_long++;
            count[Math.abs(A[i])]++;
            sum += Math.abs(A[i]);
        }

        int[] arr = new int[count_long];
        int l = 0;
        for(int i = 0;i<count.length;i++){
            if(count[i]>0)
                arr[l++] = i;
        }
        int[][] dp = new int[arr.length][sum/2+1];
        for(int j = 0;j<=sum/2;j++){
            int num = j/arr[0];
            if(num>=count[arr[0]])
                dp[0][j] = count[arr[0]]*arr[0];
            else
                dp[0][j] = num*arr[0];
        }
        for(int i = 1;i<arr.length;i++){
            for(int w = 1;w<=sum/2;w++){
                 for(int j = 0;j<=count[arr[i]];j++)
                     if(w-j*arr[i]>=0)
                         dp[i][w] = Math.max(dp[i][w],dp[i-1][w-j*arr[i]]+j*arr[i]);
            }
        }
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return Math.abs(sum-2*dp[arr.length-1][sum/2]);
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{7}));
    }
}
