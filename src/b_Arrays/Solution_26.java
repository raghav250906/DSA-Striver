package b_Arrays;

public class Solution_26 {
    public static int secondLargestElement(int[] arr) {
        int largest= arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(arr));
    }
}
