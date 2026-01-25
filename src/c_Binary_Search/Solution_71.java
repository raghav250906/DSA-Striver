package c_Binary_Search;

import java.util.*;
public class Solution_71 {
    public int findMin(ArrayList<Integer> arr) {
        int n=arr.size();
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high){
            int mid= (high+low)/2;
            if(arr.get(low)<=arr.get(mid)){
                ans= Math.min(ans,arr.get(low));
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr.get(mid));
                high=mid-1;
            }
        }
        return ans;
    }
}
