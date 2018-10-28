package codility0703;

import java.util.Stack;

/**
 * Create by lbsswhu
 * date 18/09/01
 */
public class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<S.length();i++){
            if(st.empty()){
                st.push(S.charAt(i));
                continue;
            }
            switch (st.peek()){
                case '{':
                    if(S.charAt(i) == '}')
                        st.pop();
                    else
                        st.push(S.charAt(i));
                    break;
                case '[':
                    if(S.charAt(i) == ']')
                        st.pop();
                    else
                        st.push(S.charAt(i));
                    break;
                case '(':
                    if(S.charAt(i) == ')')
                        st.pop();
                    else
                        st.push(S.charAt(i));
                    break;
                default:st.push(S.charAt(i));break;
            }
        }
        return st.isEmpty()?1:0;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        t.solution("([)()]");
    }
}
