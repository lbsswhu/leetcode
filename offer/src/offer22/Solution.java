package offer22;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Create by lbsswhu
 * date 18/09/23
 */


 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
    this.val = val;
    }
 }
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null)
            return res;
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode temp = que.poll();
            res.add(temp.val);
            if(temp.left != null)
                que.offer(temp.left);
            if(temp.right != null)
                que.offer(temp.right);
        }
        return res;
    }
}
