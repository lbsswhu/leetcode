package codility1504;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int left = 0;
        int right = A.length;
        int min = Math.min(2*Math.abs(A[left]),2*Math.abs(A[right]));
        while(left<right){
            min = Math.min(Math.abs(A[left]+A[right]),min);
            if(Math.abs(A[left])<Math.abs(A[right])){
                right--;
                min = Math.min(Math.abs(A[left]+A[right]),min);
            }else{
                left++;
                min = Math.min(Math.abs(A[left]+A[right]),min);
            }
        }
        return min;
    }
}
