package codility1201;

/**
 * Create by lbsswhu
 * date 18/09/06
 */
public class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        int n = N,m = M;
        while(n%m != 0){
            int temp = n;
            n = m;
            m = temp%m;
        }
        return N/m;
    }

    public static void main(String[] args) {
        Solution t= new Solution();
        System.out.println(t.solution(12,21));
    }
}
