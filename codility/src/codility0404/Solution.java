package codility0404;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] temp = new boolean[A.length+1];
        Arrays.fill(temp,false);
        for(int i =0;i<A.length;i++){
            if(A[i]<=A.length && temp[A[i]] == false)
                temp[A[i]] = true;
        }
        for(int i = 1;i<= temp.length;i++){
            if(temp[i] == false)
                return i;
        }
        return A.length+1;
    }
}
