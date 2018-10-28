package codility1002;

/**
 * Create by lbsswhu
 * date 18/09/18
 */
public class Solution {
    public static int solution(int N) {
        // write your code in Java SE 8
        int boundry = (int)Math.sqrt(N);
        for(int i = boundry;i>=1;i--){
            if(N%i == 0){
                return 2*(i+N/i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(101));
    }
}
