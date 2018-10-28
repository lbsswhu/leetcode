package offer03;

/**
 * Create by lbsswhu
 * date 18/09/22
 */

/*
 * 递归实现从尾部开始输出链表
 */
import java.util.ArrayList;
 class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
 }
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        reverseValueOfList(listNode,res);
        return res;
    }
    public void reverseValueOfList(ListNode listNode,ArrayList<Integer> res){
        if(listNode != null){
            reverseValueOfList(listNode.next,res);
            res.add(listNode.val);
        }else
            return;
    }
}
