package weekly108_4;

import java.util.ArrayList;

/*
For some fixed N, an array A is beautiful if it is a permutation of the integers 1, 2, ..., N, such that:
For every i < j, there is no k with i < k < j such that A[k] * 2 = A[i] + A[j].
Given N, return any beautiful array A.  (It is guaranteed that one exists.)
 */
public class Solution {
    public int[] beautifulArray(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while(res.size()<N){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i:res) if(i*2-1<= N) temp.add(i*2-1);
            for(int i:res) if(i*2 <= N) temp.add(i*2);
            res = temp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int[] a  = t.beautifulArray(4);
        for(int i:a) System.out.println(i);
    }
}
