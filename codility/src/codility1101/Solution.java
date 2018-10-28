package codility1101;
import java.util.Arrays;
/**
 * Create by lbsswhu
 * date 18/09/07
 */
public class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int[] count = new int[2*A.length+1];
        for(int i = 0;i<A.length;i++)
            count[A[i]]++;
        int[] res = new int[A.length];
        for(int i = 0;i<A.length;i++){
            int number = 0;
            for(int j = 1;j*j<=A[i];j++){
                if(A[i]%j == 0){
                    number += count[j];
                    if(A[i]/j != j)
                        number += count[A[i]/j];
                }
                res[i] = A.length - number;
            }
        }
        return res;
    }
}
