package offer06;

/**
 * Create by lbsswhu
 * date 18/09/22
 */

/*
 * 二分法的简单利用
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0 || array == null)
            return 0;
        else
            return findMinValue(array,0,array.length-1);
    }
    public int findMinValue(int[] array,int left,int right){
        if(right<=left || array[left]<array[right])
            return array[left];
        int mid = (left+right)/2;
        if(array[left]>array[mid])
            return findMinValue(array,left,mid);
        else if(array[left] == array[mid])
            return findMinValue(array,left,mid-1)<findMinValue(array,mid+1,right)?
                    findMinValue(array,left,mid-1):findMinValue(array,mid+1,right);
        else
            return findMinValue(array,mid+1,right);
    }
}
