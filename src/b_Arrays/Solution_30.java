package b_Arrays;

public class Solution_30 {
//    public static void rotateArrayByK(int[] arr, int k) {
//        k=k%arr.length;
//        while(k>0){
//            int key=arr[0];
//            for(int i=0; i<arr.length-1;i++){
//                arr[i]=arr[i+1];
//            }
//            arr[arr.length-1]=key;
//            k--;
//        }
//    }

    public static void rotateArrayByK(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        if(k==0){
            return;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[]arr,int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateArrayByK(arr,4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
