package codility0704;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Create by lbsswhu
 * date 18/09/01
 */
public class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<H.length;i++){
           if(st.isEmpty()){
               st.push(H[i]);
               res++;
               continue;
           }
            if(H[i]>st.peek()){
                st.push(H[i]);
                res++;
            }
           while(!st.isEmpty() && H[i]<st.peek()){
               st.pop();
           }

        }
        return res;

    }
}
