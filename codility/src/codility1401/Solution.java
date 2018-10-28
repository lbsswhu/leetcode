package codility1401;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
public class Solution {
    public boolean findMid(int[] A,int mid,int K){
        int sum = 0;
        K--;
        for(int i = 0;i<A.length;){
            if((sum += A[i]) > mid){
                if(--K<0)
                    return false;
                sum = 0;
            }else{
                i++;
            }
        }
        return true;
    }
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int left = -1;
        int right = 0;
        for(int i = 0;i<A.length;i++){
            right += A[i];
            left = Math.max(left,A[i]);
        }
        while(left<=right){
            int mid = (left+right)>>1;
            if(findMid(A,mid,K))
                right = mid -1;
            else
                left = mid+1;
        }
        return right+1;
    }
}
