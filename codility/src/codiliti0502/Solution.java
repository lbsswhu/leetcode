package codiliti0502;

import java.util.Arrays;

public class Solution {
    public int getImpact(char c){
        switch (c){
            case 'A':return 1;
            case 'C':return 2;
            case 'G':return 3;
            default:return 4;
        }
    }
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] res = new int[P.length];
        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];
        int[] T = new int[S.length()];
        switch (S.charAt(0)){
            case 'A':
                A[0] = 1;
                C[0] = 0;
                G[0] = 0;
                T[0] = 0;
                break;
            case 'C':
                A[0] = 0;
                C[0] = 2;
                G[0] = 0;
                T[0] = 0;
                break;
            case 'G':
                A[0] = 0;
                C[0] = 0;
                G[0] = 3;
                T[0] = 0;
                break;
            case 'T':
                A[0] = 0;
                C[0] = 0;
                G[0] = 0;
                T[0] = 4;
                break;
            default:break;
        }
        for(int i = 1;i<S.length();i++){
            switch (S.charAt(i)){
                case 'A':
                    A[i] = A[i-1]+1;
                    C[i] = C[i-1];
                    G[i] = G[i-1];
                    T[i] = T[i-1];
                    break;
                case 'C':
                    A[i] = A[i-1];
                    C[i] = C[i-1]+2;
                    G[i] = G[i-1];
                    T[i] = T[i-1];
                    break;
                case 'G':
                    A[i] = A[i-1];
                    C[i] = C[i-1];
                    G[i] = G[i-1]+3;
                    T[i] = T[i-1];
                    break;
                case 'T':
                    A[i] = A[i-1];
                    C[i] = C[i-1];
                    G[i] = G[i-1];
                    T[i] = T[i-1]+4;
                    break;
                default:break;
            }
        }

        for(int i=0;i<P.length;i++){
            if(P[i] == 0){
                if(A[Q[i]]>0)
                    res[i] = 1;
                else if (C[Q[i]]>0)
                    res[i] =2;
                else if (G[Q[i]]>0)
                    res[i] =3;
                else
                    res[i] =4;
            }
            else {
                if(A[Q[i]]-A[P[i]-1]>0)
                    res[i] = 1;
                else if (C[Q[i]]-C[P[i]-1]>0)
                    res[i] =2;
                else if (G[Q[i]]-G[P[i]-1]>0)
                    res[i] =3;
                else
                    res[i] =4;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        t.solution("CAGCCTA",new int[]{2, 5, 0},new int[]{4, 5, 6});
    }
}
