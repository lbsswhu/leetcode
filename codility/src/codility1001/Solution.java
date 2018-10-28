package codility1001;

/**
 * Create by lbsswhu
 * date 18/09/18
 */
public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int res = 0;
        int boundary = (int)Math.sqrt(N);
        for(int i = 1;i<boundary;i++){
            if(N%i == 0){
                if(i*boundary == N)
                    res += 1;
                else
                    res += 2;
            }
        }
        return res;
    }
}
