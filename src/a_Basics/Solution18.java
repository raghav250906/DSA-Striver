package a_Basics;

public class Solution18 {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1; j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
