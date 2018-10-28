package codility1602;

/**
 * Create by lbsswhu
 * date 18/09/04
 */
public class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int res = 0;
        int temp = 0;
        for(int i = 0;i<A.length;i++){
            temp = temp+A[i];
            if(temp>=K){
                res++;
                temp = 0;
            }
        }
        return res;
    }
}
