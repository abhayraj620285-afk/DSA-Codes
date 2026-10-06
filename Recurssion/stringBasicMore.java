package Recurssion;

import java.util.ArrayList;

public class stringBasicMore{
    static void main() {
        String s = "Abhay";
        ArrayList<Integer> list = new ArrayList<>();
        helper(s);
        System.out.println(s);
    }
    public static void helper(String s){
        s = "Raj";
    }
}
