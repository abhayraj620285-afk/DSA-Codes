package Recurssion;
import java.util.*;
public class CheckPalindrome {
    static void main() {
        String s = "abba";
        StringBuilder str = new StringBuilder(s);
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
       boolean bol =  helper(s.length()-1,str,rev);
        System.out.println(bol);
    }
    public static boolean helper(int i,StringBuilder str,StringBuilder rev){
        if(i<0) return true;
        char ch1 = str.charAt(i);
        char ch2 = rev.charAt(i);
        if(ch1!=ch2) return false;
        return helper(i-1,str,rev);
    }
}
