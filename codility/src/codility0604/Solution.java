package codility0604;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/08/31
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long[] A1 = new long[A.length];
        long[] A2 = new long[A.length];
        for(int i = 0;i<A.length;i++){
            A1[i] = (long)A[i]+i;
            A2[i] = -((long)A[i]-i);
        }
        Arrays.sort(A1);
        Arrays.sort(A2);

        long count = 0;
        for(int i = 0;i<A1.length;i++){
            int pos = Arrays.binarySearch(A2,A1[i]);
            if(pos>=0){
                while (pos<A2.length && A1[i] == A2[pos])
                    pos++;
                count = count+pos;
            }else{
                count = count-(pos+1);
            }
        }
        count = count -((long)A.length+1)*(long)A.length/2;

        if(count>10000000)
            return -1;
        return (int)count;
    }
}
