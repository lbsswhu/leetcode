package codility0802;

/**
 * Create by lbsswhu
 * date 18/09/01
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0)
            return -1;
        int count = 1;
        int temp = A[0];
        int leader = 0;
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
            for(int i = 0;i<A.length;i++){
                if(A[i]==temp){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));;
    }
}
