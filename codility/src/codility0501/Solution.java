package codility0501;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int total = 0;
        int pre_total = 0;
        int res = 0;
        for(int i =0;i<A.length;i++)
            if(A[i] == 1)
                total++;
        for(int i = 0;i<A.length;i++){
            if(A[i] == 0){
                res = res+total-pre_total;
                if(res>1000000000)
                    return -1;
            }

            else
                pre_total++;
        }
        return res;
    }
}
