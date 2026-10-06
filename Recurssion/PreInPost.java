package Recurssion;

public class PreInPost {
    static void main() {
        pip(2);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.println("Pre" + n);
        pip(n-1);;
        System.out.println("In" + n);
        pip(n-1);
        System.out.println("Post" + n);
    }
}
