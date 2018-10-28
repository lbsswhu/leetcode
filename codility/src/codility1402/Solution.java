package codility1402;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
public class Solution {
    public int solution(int[] A, int[] B, int[] C) {
        // write your code in Java SE 8
        int M = C.length;
        int N = A.length;
        int res = -1,left = 0,right = M;
        while(left<=right){
            int mid = (left+right) >> 1;
            int[] v = new int[M*2+1];
            for(int i = 0;i<mid;i++)
                v[C[i]]++;
            for(int i = 1;i<M*2+1;i++)
                v[i] += v[i-1];
            boolean can = true;
            for(int i = 0;i<N;i++){
                if(v[B[i]]-v[A[i]-1] == 0){
                    left = mid+1;
                    can = false;
                    break;
                }
            }
            if(can){
                res = mid;
                right = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{1},
                new int[]{2},
                new int[]{2}));
//        System.out.println(t.solution(new int[]{1,4,5,8},
//                new int[]{4,5,9,10},
//                new int[]{4, 6, 7, 10, 2}));
    }
}
