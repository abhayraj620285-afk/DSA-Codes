package DynamicProgramming;

public class perfectSquare {
    public static  int numSquares(int n) {
        return helper(1,n,0);
    }
    public static int helper(int i,int n,int val){
        if(val==n) return 0;
        if(val>n || i>n) return Integer.MAX_VALUE;
        int skip = helper(i+1,n,val);
        int sqrt = (int)Math.sqrt(i);
        if(sqrt*sqrt!=i) return skip;
        // we have not increased i by 1 because we have to take it multiple times
        int dummy = helper(i,n,i+val);
        int pick =  dummy==Integer.MAX_VALUE ? Integer.MAX_VALUE : 1+dummy;
        return Math.min(pick,skip);
    }

    static void main() {
        int n = 12;
        System.out.print(numSquares(n));
    }
}
