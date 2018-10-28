package codility1503;

import java.util.HashSet;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<A.length;i++)
            set.add(Math.abs(A[i]));
        return set.size();
    }
}
