package codility1102;

/**
 * Create by lbsswhu
 * date 18/09/07
 */
public class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] prime_pre = new int[N+1];
        int M = P.length;
        int[] res = new int[M];
        for(int i = 2;i*i<=N;i++){
            if(prime_pre[i] != 0)
                continue;
            int k = i*i;
            while(k<=N){
                if(prime_pre[k] == 0){
                    prime_pre[k] = i;
                }
                k+=i;
            }
        }

        int[] sime_prime = new int[N+1];
        for(int i = 4;i<N+1;i++){
            if(prime_pre[i] == 0)
                sime_prime[i] = sime_prime[i-1];
            else{
                if(prime_pre[i/prime_pre[i]] == 0)
                    sime_prime[i] = sime_prime[i-1]+1;
                else
                    sime_prime[i] = sime_prime[i-1];
            }
        }
        for(int i =0;i< M;i++){
            res[i] = sime_prime[Q[i]]-sime_prime[P[i]-1];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int[]  ts = t.solution(26,new int[]{1,4,16},new int[]{26,10,20});
        for(int i =0;i<ts.length;i++)
            System.out.print(ts[i]+" ");
    }
}
