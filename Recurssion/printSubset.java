package Recurssion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class printSubset {
    static void main() {
        String s = "abc";
        ArrayList<String> str = new ArrayList<>();
        helper(0,s,"",str);
        Collections.sort(str);
        System.out.println(str);
        System.out.println(str.size());
    }
    public static void helper(int idx,String s,String ans,ArrayList<String> str){
        if(idx==s.length()) {
            if(ans.length()!=0)  str.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        helper(idx+1,s,ans+ch,str); // pick
        helper(idx+1,s,ans,str); // skip
    }
}
