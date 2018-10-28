package codility0504;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        double avg_min = (A[0] + A[1])/2.0;
        int avg_min_pos = 0;

        double avg2, avg3;
        for(int i = 0; i < A.length - 2; i++)
        {
            avg2 = (A[i] + A[i + 1]) / 2.0;
            avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if( avg2 < avg_min)
            {
                avg_min = avg2;
                avg_min_pos = i;
            }

            if( avg3 < avg_min)
            {
                avg_min = avg3;
                avg_min_pos = i;
            }

        }

        if((A[A.length - 1] + A[A.length - 2]) /2.0 < avg_min)
        {
            avg_min = (A[A.length - 1] + A[A.length - 2]) /2.0;
            avg_min_pos = A.length - 2;
        }
        return avg_min_pos;

    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));;
    }
}
