package Recurssion;

public class RecArray {
    static void recPrint(int[] arr,int idx){
        if(idx>arr.length-1) return;
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);
    }
    static boolean exist(int[] arr,int target,int idx){
        if(idx>arr.length-1) return false;
        if(arr[idx]==target) return true;
        return exist(arr,target,idx+1);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6};
      //  recPrint(arr,0);
        int ele = 6;
        System.out.println(exist(arr,ele,0));
    }
}
