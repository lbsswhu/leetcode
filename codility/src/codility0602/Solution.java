package codility0602;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Create by lbsswhu
 * date 18/08/30
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        PriorityQueue<Integer> que1 = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> que2 = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i=0;i<A.length;i++){
            que1.offer(A[i]);
            que2.offer(A[i]);
        }
        int max = que1.poll();
        int max_2 = que1.poll();
        int max_3 = que1.poll();
        int min = que2.poll();
        int min_2 = que2.poll();
        return max*max_2*max_3>max*min*min_2?max*max_2*max_3:max*min*min_2;
    }
}
