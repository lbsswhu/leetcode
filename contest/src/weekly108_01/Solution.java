package weekly108_01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String s:emails){
            String[]  ts = s.split("@");
            StringBuffer temp = new StringBuffer("");
            for(int i = 0;i<ts[0].length();i++){
                char c = ts[0].charAt(i);
                if( c == '+')
                    break;
                else if(c == '.')
                    continue;
                else
                    temp.append(c);
            }
            temp.append("@"+ts[1]);
            set.add(temp.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
