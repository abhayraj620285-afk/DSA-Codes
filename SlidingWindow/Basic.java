package SlidingWindow;

public class Basic {
    static void main() {
        int[] arr = {2,1,5,1,3,2};
        int max = 0;
        int k = 3;
        int j = 0;
        int sum = 0;
        for(j=0;j<k;j++){
            sum+=arr[j];
        }
        int i=0;
        max = Math.max(max,sum);
        while(j<arr.length){
            sum+=arr[j];
            sum-=arr[i];
            i++;
            j++;
            max = Math.max(sum,max);

        }
        System.out.println(max);
    }
}
