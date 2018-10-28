package codility0603;

import java.util.Arrays;

/**
 * Create by lbsswhu
 * date 18/08/30
 */
public class Solution {
    public void quickSort(int[] A,int low,int high){
        int i = low;
        int j = high;
        if(i<j){
            int mark_num = A[i];
            while(i<j){
                while (A[j]>mark_num && i<j)
                    j--;
                A[i] = A[j];
                while(A[i]<=mark_num && i<j)
                    i++;
                A[j] = A[i];
            }
            A[i] = mark_num;
            quickSort(A,low,i-1);
            quickSort(A,i+1,high);
        }

    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        int j=0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>0)
                B[j++] = A[i];
        }
        if(j<2)
            return 0;
        Arrays.sort(B,0,j-1);
        quickSort(B,0,j-1);
        for(int i = 0;i<j-2;i++){
            if((long)B[i]+(long)B[i+1]>(long)B[i+2])
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution t= new Solution();
        System.out.println(t.solution(new int[]{10, 2, 5, 1, 8, 20}));
    }
}
