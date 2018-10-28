package codility0201;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length == 0 || A.length == 1)
            return A;
        if(A.length>1 && (K%A.length == 0))
            return A;
        K = K % A.length;
        int[] res = new int[A.length];
        int start_1 = A.length-K-1;
        int end = A.length-1;
        int start_2 = start_1+1;
        while(start_1>=0)
            res[end--] = A[start_1--];
        int i = 0;
        while(start_2<A.length)
            res[i++] = A[start_2++];
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int[] res = t.solution(new int[]{1, 1, 2, 3, 5},42);
        for(int i = 0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
