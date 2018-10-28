package codility1601;

/**
 * Create by lbsswhu
 * date 18/09/03
 */
public class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count = 0;
        for(int i = 0;i<B.length;i++){
            if(B[i] == -1)
                continue;
            for(int begin = i+1;begin<A.length;begin++){
                if(B[begin]!= -1 && A[begin]<=B[i]){
                    B[begin] = -1;
                    count++;
                }
                else
                    break;
            }
        }
        return B.length-count;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{1,3,7,9,9},new int[]{5,6,8,9,10}));
    }
}
