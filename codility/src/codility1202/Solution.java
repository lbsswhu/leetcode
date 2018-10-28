package codility1202;

/**
 * Create by lbsswhu
 * date 18/09/06
 */
public class Solution {
    public int gcd(int A,int B){
        if(A%B == 0)
            return B;
        else
            return gcd(B,A%B);
    }
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int res = 0;
        for(int i = 0;i<A.length;i++){
            int a = A[i],b = B[i];
            int g = gcd(A[i],B[i]);
            int ga = g,gb = g;
            while(a%ga == 0 && ga != 1){
                a = a/ga;
                ga = gcd(a,ga);
            }
            while(b%gb == 0 && gb != 1){
                b = b/gb;
                gb = gcd(b,gb);
            }
            if(a == b)
                res++;
        }
        return res;
    }
}
