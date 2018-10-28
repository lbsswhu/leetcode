package codility0903;

import java.util.PriorityQueue;

/**
 * Create by lbsswhu
 * date 18/09/17
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 3)
            return 0;
        int res = 0;
        int maxLeft = 0;
        int center = 1;
        int maxdouble = 0;
        for(int i = 3;i<A.length;i++){
            maxLeft = Math.max(maxLeft+A[i-2],A[i-2]);
            maxdouble = Math.max(maxdouble+A[i-1],Math.max(A[i-1],maxLeft));
            if(maxdouble == maxLeft)
                center = i-1;
            else if(maxdouble == A[i-1])
                center = i-2;
            res = res>maxdouble?res:maxdouble;
        }
        return res;
    }
}
