package a_Basics;

public class Solution22 {
    static int[] recBubbleSort(int[] arr, int n){
        if(n==0) return arr;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return recBubbleSort(arr,n-1);
    }

    static void bubbleSort(int[] arr, int n, int i){
        if(n==1) return ;
        if(i==n-1){
            bubbleSort(arr,n-1,0);
            return;
        }
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        bubbleSort(arr,n,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr,arr.length,0);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
