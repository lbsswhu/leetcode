package codility1302;

/**
 * Create by lbsswhu
 * date 18/09/06
 */
public class Solution {
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int max =0;
        for(int i = 0;i<A.length;i++)
            max = max>A[i]?max:A[i];
        int[]  F = new int[max+1];
        if(max==1)
            return new int[]{1};
        F[1] = 1;
        F[2] = 2;
        for(int i = 3;i<=max;i++)
            F[i] = F[i-1]+F[i-2];
        int[] res  = new int[A.length];
        for(int i = 0;i<A.length;i++)
            res[i] = F[A[i]] - (F[A[i]]>>B[i]<<B[i]);
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int[] rest = t.solution(new int[]{1},new int[]{1});
        for(int i = 0;i<rest.length;i++)
            System.out.print(rest[i]);
        System.out.println();
    }
}
