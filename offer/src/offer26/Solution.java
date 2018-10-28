package offer26;

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
    TreeNode pHead;
    TreeNode currenNode;
    public TreeNode Convert(TreeNode pRootOfTree) {
        subConvert(pRootOfTree);
        return pHead;
    }
    public void subConvert(TreeNode pRoot){
        if(pRoot == null)
            return;
        subConvert(pRoot.left);
        if(currenNode == null){
            currenNode = pRoot;
            pHead = pRoot;

        }else{
            currenNode.right = pRoot;
            pRoot.left = currenNode;
            currenNode = pRoot;
        }
        subConvert(pRoot.right);
    }

}
