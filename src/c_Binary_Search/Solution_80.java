package c_Binary_Search;

import java.util.*;
public class Solution_80 {
    static int daysNeeded(int[] arr, int capacity){
        int days=1;
        int currentLoad=0;
        for(int w:arr){
            if(currentLoad+w > capacity){
                days++;
                currentLoad=w;
            }
            else currentLoad += w;
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low= Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low<=high){
            int mid= (low + high)/2;
            int noOfDays = daysNeeded(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
