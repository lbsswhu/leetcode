package codility1701;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Create by lbsswhu
 * date 18/09/02
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayDeque<Integer> que = new ArrayDeque<>();
        int[] dp = new int[A.length];
        if(A.length==0)
            return 0;
        dp[0] = A[0];
        que.offerLast(0);
        for(int i = 1;i<A.length;i++){
            dp[i] = dp[que.peekFirst()]+A[i];
            while(!que.isEmpty() && dp[que.peekLast()]<dp[i])
                que.removeLast();
            que.offerLast(i);
            if(i-que.peekFirst()+1>6)
                que.removeFirst();
        }
        return dp[A.length-1];
    }

    public static void main(String[] args) {
        Solution t =new Solution();
        System.out.println(t.solution(new int[]{1, -2, 4, 3, -1, -3, -7, 4, -9}));;
    }
}
