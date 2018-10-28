package codility0702;

import java.util.Stack;

/**
 * Create by lbsswhu
 * date 18/09/01
 */
public class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> stA = new Stack<>();
        Stack<Integer> stB = new Stack<>();
        int length = A.length;
        for(int i = 0;i<length;i++){
            if(stA.size() == 0 && stB.size() == 0 || stB.peek() == B[i]){
                stA.push(A[i]);
                stB.push(B[i]);
                continue;
            }
            while(!stB.isEmpty() && stB.peek() != B[i]){
                if(stB.peek()==0){
                    stB.push(B[i]);
                    stA.push(A[i]);
                    break;
                }else{
                    if(A[i]>stA.peek()){
                        stA.pop();
                        stB.pop();
                    }else{
                        break;
                    }
                }
            }
            if(stB.isEmpty()||stB.peek()==0){
                stA.push(A[i]);
                stB.push(B[i]);
            }
        }
        return stA.size();
    }
}
