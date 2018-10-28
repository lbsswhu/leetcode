package offer27;
import java.util.ArrayList;
/**
 * Create by lbsswhu
 * date 18/09/23
 */

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str != null){
            char[] str_char = str.toCharArray();
        }
        return res;
    }
    public void fullyArrange(char[] str,int start,ArrayList<String> res){
        if(start == str.length -1){
            String temp  = str.toString();
            if(!res.contains(temp))
            res.add(temp);
        }
        for(int i = start;i<str.length;i++){
            swarp(str,start,i);
            fullyArrange(str,start+1,res);
            swarp(str,start,i);
        }
    }
    public void swarp(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
