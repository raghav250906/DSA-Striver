package a_Basics;

public class Solution13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int start = 0;
        int last = arr.length - 1;
//        reverse(arr,start,last);
        reverse(arr,arr.length);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
//    public static void reverse(int[] arr, int start , int last) {
//        if(start>=last){
//            return;
//        }
//        int temp;
//        temp = arr[start];
//        arr[start]=arr[last];
//        arr[last]=temp;
//
//        reverse(arr,start+1,last-1);
//        return;
//    }

    public static void reverse(int[]arr,int n){
        int start =0;
        while(start<n){
            int temp = arr[start];
            arr[start]=arr[n-1];
            arr[n-1]=temp;
            start++;
            n--;
        }
    }
}
