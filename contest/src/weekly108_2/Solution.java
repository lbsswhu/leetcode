package weekly108_2;

import java.util.ArrayList;

public class Solution {
    public static int numSubarraysWithSum(int[] A, int S) {
        ArrayList<Integer> zero = new ArrayList<>();
        int count_zero = 0;
        int count_one = 0;
        int res = 0;
        for(int i:A){
            if(i == 1){
                zero.add(count_zero);
                count_zero = 0;
                count_one++;
            }else
                count_zero++;
        }
        zero.add(count_zero);
        if(count_one<S)
            return res;
        if(S == 0){
            for(int i = 0;i<zero.size();i++)
                res += zero.get(i)*(zero.get(i)+1)/2;
        }else{
            for(int i = 1;i<=count_one-S+1;i++)
                res += (zero.get(i-1)+1)*(zero.get(i+S-1)+1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {1,1,1,1,1};
        System.out.println(Solution.numSubarraysWithSum(A,2));
    }
}
