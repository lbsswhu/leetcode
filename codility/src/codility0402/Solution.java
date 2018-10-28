package codility0402;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/08/29
 */
public class Solution {
    public int solution(int X, int A[]){
        int count=0;
        boolean[] temp  = new boolean[X+1];
        Arrays.fill(temp,false);
        for(int i = 0;i<A.length;i++){
            if(temp[A[i]] == false){
                count++;
                temp[A[i]] = true;
                if(count == X)
                    return i;
            }
        }
        return -1;
    }
}
