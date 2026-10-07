package SlidingWindow;

// Approach for Dynamic size Sliding Window
// Smallest Subarray with sum>=target
public class DynamicWindow {
    static void main() {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int minWin = Integer.MAX_VALUE;
        int j = 0;
        int sum = 0;
        int i=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>=target){
                minWin = Math.min(minWin,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(minWin);

    }
}
