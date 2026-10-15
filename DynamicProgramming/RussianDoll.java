package DynamicProgramming;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Arrays;

// LIS application
public  class RussianDoll {
    public static int lcs(int i,int[][] arr,int prev){
        if(i>=arr.length) return 0;
        int skip = lcs(i+1,arr,prev);
        if(prev!=-1){
            if(arr[prev][0]>=arr[i][0] || arr[prev][1]>=arr[i][1]) return skip;
        }
        int pick = 1+lcs(i+1,arr,i);
        return Math.max(pick,skip);
    }
    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int n = envelopes.length;
        return lcs(0,envelopes,-1);
    }

    static void main() {
        int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        System.out.println( maxEnvelopes(envelopes));
    }


//    public int maxEnvelopes(int[][] envelopes) {
//    // Comparator Function
//    Arrays.sort(envelopes, (a, b) -> {
//        if(a[0] == b[0]) return b[1] - a[1];
//        else return a[0] - b[0];
//    });
//    ArrayList<Integer> arr = new ArrayList<>();
//    for(int i=0;i<envelopes.length;i++){
//       arr.add(envelopes[i][1]);
//    }
//    ArrayList<Integer> ans = new ArrayList<>();
//    for(int i=0;i<arr.size();i++){
//        if(ans.isEmpty() || arr.get(i)>=ans.get(ans.size()-1)){
//            ans.add(arr.get(i));
//        }else{
//            binary(arr.get(i),ans);
//        }
//    }
//    return ans.size();
//    }
//
//    public void binary(Integer ele, ArrayList<Integer> list) {
//        int low = 0;
//        int high = list.size()-1;
//        int lb = -1;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(list.get(mid)>=ele){
//                lb = mid;
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        list.set(lb,ele);
//    }
}
