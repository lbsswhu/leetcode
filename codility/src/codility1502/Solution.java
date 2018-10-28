package codility1502;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length<3)
            return 0;
        int res = 0;
        Arrays.sort(A);
        for(int i = A.length-1;i>=2;i--){
            int left = 0,right = i-1;
            while(left<right){
                if(A[left]+A[right]>A[i]){
                    res += right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{10,2,5,1,8,12}));
    }
}
