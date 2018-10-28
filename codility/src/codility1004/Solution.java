package codility1004;
import java.util.ArrayList;
/**
 * Create by lbsswhu
 * date 18/09/20
 */
public class Solution {
    public int solution(int[] A) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                array.add(i);
            }
        }
        if (array.size() == 1 || array.size() == 0) {
            return array.size();
        }
        int sf = 1;
        int ef = array.size();
        int result = 1;
        /*
         * K(K-1)<dis,K为假定的最终能得到的flag的个数
         */
        while (sf <= ef) {
            /*
             * 使用二分法确定K，即确定最终能够得到flag的个数
             */
            int K = (sf + ef) / 2;
            boolean suc = false;
            int used = 0;
            int mark = array.get(0);

            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) >= mark) {
                    used++;
                    /*
                     * K既是个数，也是距离
                     */
                    mark = array.get(i) + K;

                    if (used == K) {
                        suc = true;
                        break;
                    }
                }
            }
            //K满足一轮，使用更大的K，否则减小K
            if (suc) {
                result = K;
                sf = K + 1;
            } else {
                ef = K - 1;
            }
        }
        return result;
    }
}
