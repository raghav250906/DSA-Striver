package c_Binary_Search;

import java.util.Arrays;
import java.util.Collections;

public class Solution_83 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        System.out.println(findPages(arr,2));
    }
    static int countOfStudents(int[] nums,int pages){
        int students=1;
        int studentPages=0;
        for(int i=0;i<nums.length;i++){
            if(studentPages + nums[i]<=pages){
                studentPages+=nums[i];
            }
            else {
                students++;
                studentPages = nums[i];
            }
        }
        return students;
    }
    public static int findPages(int[] nums, int m) {
        int n = nums.length;
        if(n<m) return -1;
        int low = Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
            if(low<nums[i]){
                low= nums[i];
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            int countStudents = countOfStudents(nums,mid);
            if(countStudents>m){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
    }
}
