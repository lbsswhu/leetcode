package codility0901;

/**
 * Create by lbsswhu
 * date 18/09/17
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(Integer a:A){
            if(a>min)
                res = res > (a - min)?res:(a - min);
            else
                min = a;
        }
        return res;
    }
}
