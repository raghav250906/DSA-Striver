package b_Arrays;

public class Solution_25 {
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]= (int)(Math.random());
        }
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println(largestElement(arr));

    }
}
