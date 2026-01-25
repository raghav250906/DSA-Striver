package a_Basics;

public class Solution19 {
    static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1;i++){
            boolean swap = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
