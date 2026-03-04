package a_Basics;

import java.util.*;
public class Solution21 {
    static void mergeSort(int[] arr, int low, int high){

        if(low>=high) return;

        int mid = (low+high)/2;

        mergeSort(arr,low, mid);

        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }

    static void merge(int[]arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left= low;
        int right= mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left++]);
            }
            else temp.add(arr[right++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 11, 67, 12, 22, 11};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
