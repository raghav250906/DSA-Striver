package c_Binary_Search;

import java.util.*;
public class Solution_72 {
    public int findKRotation(ArrayList<Integer> arr) {
        int n=arr.size();
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index=-1;
        while (low<=high){
            int mid= (high+low)/2;
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<ans){
                    index=low;
                    ans=arr.get(low);
                }
                low=mid+1;
            }
            else{
                if(arr.get(mid)<ans){
                    ans=arr.get(mid);
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
}
