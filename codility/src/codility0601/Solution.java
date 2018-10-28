package codility0601;

import java.util.HashSet;

/**
 * Create by lbsswhu
 * date 18/08/30
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> temp = new HashSet<>();
        for(int i = 0;i<A.length;i++)
            temp.add(A[i]);
        return temp.size();
    }
}
