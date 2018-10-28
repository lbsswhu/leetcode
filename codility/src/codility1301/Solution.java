package codility1301;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Create by lbsswhu
 * date 18/09/05
 */
class Step {
    int nextpos;
    int step;
    Step(int nextpos, int step){
        this.nextpos = nextpos;
        this.step = step;
    }
}
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res;
        ArrayList<Integer> F = new ArrayList<>();
        F.add(0);F.add(1);
        int k = 2,start = -1;
        while(start+F.get(k-1)<=A.length){
            F.add(F.get(k-1)+F.get(k-2));
            k++;
        }
        Queue<Step> que = new LinkedList<>();
        que.offer(new Step(start,0));
        boolean[] visited_pos =  new boolean[A.length];
        while(que.size()>0){
            Step next = que.poll();
            for(int i = F.size()-1;i>0;i--){
                int new_pos = next.nextpos+F.get(i);
                if(new_pos == A.length)
                    return next.step+1;
                if(new_pos>A.length || A[new_pos] == 0 ||visited_pos[new_pos] == true)
                    continue;
                que.offer(new Step(next.nextpos+F.get(i),next.step+1));
                visited_pos[next.nextpos+F.get(i)] = true;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(new int[]{0}));
//        System.out.println(t.solution(new int[]{0,1,0,1,1,0,1,0,0,0,0}));
    }
}
