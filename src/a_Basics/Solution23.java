package a_Basics;

public class Solution23 {
    static void recInsertionSort(int[] arr,int i,int n){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        recInsertionSort(arr,i+1,n);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,1,6};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        recInsertionSort(arr,0,arr.length);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
