package offer24;

import java.util.ArrayList;

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
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null)
            return res;
        temp.add(root.val);
        if(root.left == null && root.right == null && target == root.val)
            res.add(new ArrayList<>(temp));
        FindPath(root.left,target-root.val);
        FindPath(root.right,target-root.val);
        temp.remove(temp.size()-1);
        return res;
    }
}
