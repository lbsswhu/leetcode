package codility0401;

import java.util.Arrays;
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        boolean[] temp = new boolean[N+1];
        Arrays.fill(temp,false);
        for(int i = 0;i<N;i++){
            if(A[i]>N)
                return 0;
            else
                temp[A[i]] = true;
        }
        for(int i = 1;i<=N;i++){
            if(temp[i]==false)
                return 0;
        }
        return 1;
    }
}
