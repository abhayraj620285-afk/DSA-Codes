package Recurssion;

public class aPowb {
    static void main() {
        int x = 1;
        int n = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<=12;i++){
            if(x%i==0 && n%i==0) ans = Math.max(ans,i);
        }
        System.out.println(ans);
       // System.out.println(myPow(x,n));
    }
    public static double myPow(double x,int n){
        if(n==0) return 1;
        if(n==-1) return (double)(1/x);
        double call = myPow(x,n/2);
       if(n%2==0) return call*call;
       if(n<0) return (double)(1/x)*call*call;
       else return x*call*call;
    }
}
