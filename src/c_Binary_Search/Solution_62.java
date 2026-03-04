package c_Binary_Search;

public class Solution_62 {
    public static int search(int[] arr, int target) {
//        int n= arr.length;
//        int low =0;
//        int high = n-1;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]==target) return mid;
//            if(arr[mid]<target) low=mid+1;
//            else high=mid-1;
//        }
//        return -1;
        return recSearch(arr,0,arr.length-1,target);
    }

    public static int recSearch(int[] arr,int low, int high, int target) {
        int mid=(low+high)/2;
        if(low>high) return -1;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return recSearch(arr,mid+1,high,target);
        }
        else return recSearch(arr,low,mid-1,target);
    }

    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        System.out.println(search(arr,9));
    }
}
