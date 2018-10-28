package codility0801;

/**
 * Create by lbsswhu
 * date 18/09/01
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0 || A.length ==1)
            return 0;
        int count = 1;
        int temp = A[0];
        int leader = 0;
        int res = 0;
        for(int i = 1;i<A.length;i++){
            if(A[i] == temp){
                count++;
            }else{
                if(count>0)
                    count--;
                else{
                    temp=A[i];
                    count=1;
                }
            }
        }
        count = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i] == temp)
                count++;
        }

        if(count>A.length/2){
            int total = count;
            leader = temp;
            count = 0;
            for(int i = 0;i<A.length;i++){
                if(A[i]==leader){
                    count++;
                }
                if(count>i+1-count &&(total -count)>(A.length-i-1-(total -count)))
                    res++;
            }
        }else
            return 0;
        return res;

    }
}
