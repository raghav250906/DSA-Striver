package b_Arrays;

public class Solution_29 {
    public static void rotateArrayByOne(int[] arr) {
        int key=arr[0];
        for(int i=0; i<arr.length;i++){
            if(i==arr.length-1){
                arr[arr.length-1]=key;
                break;
            }
            arr[i]=arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateArrayByOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
