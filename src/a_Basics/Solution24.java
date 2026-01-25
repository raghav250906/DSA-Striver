package a_Basics;

public class Solution24 {
    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pIndex = function(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    static int function(int[] arr, int low, int high){
        int pivot = arr[low];
        int i=low;
        int j= high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j]=temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,3,2,5,7,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
