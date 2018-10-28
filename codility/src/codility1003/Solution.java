package codility1003;

/**
 * Create by lbsswhu
 * date 18/09/18
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxIndex= -1;
        int preIndex = -1;
        int length = A.length;
        int[] sumPeak = new int[length];
        for(int i = 0;i<A.length;i++){
            if(i == 0)
                sumPeak[i] = 0;
            else if(i == length -1)
                sumPeak[i] = sumPeak[i-1];
            else if(A[i]>A[i-1] && A[i]>A[i+1]){
                sumPeak[i] = sumPeak[i-1]+1;
                if(preIndex == -1)
                    preIndex = i;
                else{
                    maxIndex = Math.max(maxIndex,i-preIndex);
                    preIndex = i;
                }
            }else
                sumPeak[i] = sumPeak[i-1];
        }
        if(sumPeak[length-1] == 0)
            return 0;
        if(sumPeak[length-1] == 1)
            return 1;
        for(int d = maxIndex/2;d<=length;d++){
            if(length%d != 0)
                continue;
            boolean found = true;
            for(int i = length-1;i-d>0;i = i-d){
                if(sumPeak[i] == sumPeak[i-d]){
                    found = false;
                    break;
                }
            }
            if(found)
                return length/d;
        }
        return 0;
    }
}
