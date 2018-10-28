package codility0303;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int sumA = 0;
        for(int i=0;i<A.length;i++)
            sumA = sumA + A[i];
        int diff=Integer.MAX_VALUE;
        for(int i = 0;i<A.length-1;i++){
            sum = sum + A[i];
            if(diff>Math.abs(sumA-2*sum))
                diff = Math.abs(sumA-2*sum);
        }
        return diff;
    }
}
