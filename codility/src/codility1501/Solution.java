package codility1501;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/09/04
 */
public class Solution {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int[] count_i = new int[M+1];
        Arrays.fill(count_i,-1);
        int right = 0;
        for(int i = 0;i<A.length;i++){
            while(right<A.length&&count_i[A[right]]==-1) {
                count+=right-i+1;
                if(count>1000000000) return 1000000000;
                count_i[A[right]] = right;
                right++;
            }
            if(right==A.length) break;
            if(right<A.length&&count_i[A[right]]!=-1) {
                int newi = count_i[A[right]];
                while(i<newi) {
                    count_i[A[i]]=-1;
                    i++;
                }
                count_i[A[right]]=-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(6,new int[]{6,6,3,6,2}));
    }
}
