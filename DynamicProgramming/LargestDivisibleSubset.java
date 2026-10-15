package DynamicProgramming;

import java.util.Arrays;
import java.util.*;
public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        return lcs(0,nums,ans,0);
    }
    public static ArrayList<Integer> lcs(int i,int[] nums,ArrayList<Integer> ans,int prev){
        if(i>=nums.length){
            ArrayList<Integer> t = new ArrayList<>(ans);
            if(ans.size()!=0 ) ans.remove(ans.size()-1);
            return t;
        }
        ArrayList<Integer> skip = lcs(i+1,nums,ans,prev);

        if((nums[i]%nums[prev]!=0 && nums[prev]%nums[i]!=0)){
            return skip;
        }
        ans.add(nums[i]);
        ArrayList<Integer> pick = lcs(i+1,nums,ans,i);
        if(skip.size()>pick.size()) return skip;
        else return pick;
    }

    static void main() {
        System.out.println(largestDivisibleSubset(new int[]{1,2,3}));
    }
}
