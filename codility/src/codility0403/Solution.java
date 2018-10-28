package codility0403;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/08/29
 */
public class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] res = new int[N];
        int max = 0;
        int max_index = 0;

        for(int i = N-1;i>=0;i--){
            if(A[i] == N+1){
                max_index = i;
                break;
            }
        }

        for(int i = 0;i<A.length;i++){
            if(A[i]<=N && A[i]>0){
                res[A[i]-1]++;
                if(max < max+res[A[i]-1])
                    max = max+res[A[i]-1];
            }
        }

        for(int i=0;i<res.length;i++){
            res[i] = res[i]+max;
        }

        return res;
    }
}
