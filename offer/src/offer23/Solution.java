package offer23;

/**
 * Create by lbsswhu
 * date 18/09/23
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0 || sequence == null)
            return true;
        else
            return isSquenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean isSquenceOfBST(int[] sequence,int start,int end){
        if(start >= end)
            return true;
        int i = start;
        while(sequence[i]<sequence[end])
            i++;
        for(int j = end;i>i;i--){
            if(sequence[j]<sequence[end])
                return false;
        }
        return isSquenceOfBST(sequence,start,i-1) && isSquenceOfBST(sequence,i,end-1);
    }
}
