package codility0902;

/**
 * Create by lbsswhu
 * date 18/09/17
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(Integer a:A){
            if(sum<0)
                sum = a;
            else{
                sum += a;
            }
            res = res>sum?res:sum;
        }
        return res;
    }
}
