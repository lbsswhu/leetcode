package offer04;

/**
 * Create by lbsswhu
 * date 18/09/22
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return generateTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode generateTree(int[] pre,int start_pre,int end_pre,int[] in,int start_in,int end_in){
        if(start_pre>end_pre || start_in>end_in)
            return null;
        TreeNode res = new TreeNode(pre[start_pre]);
        for(int i = start_in;i<= end_in;i++){
            if(in[i] == pre[start_pre]){
                res.left = generateTree(pre,start_pre+1,start_pre+(i-start_in),in,start_in,i-1);
                res.right = generateTree(pre,start_pre+(i-start_in),end_pre,in,i+1,end_in);
                break;
            }
        }
        return res;
    }
}
