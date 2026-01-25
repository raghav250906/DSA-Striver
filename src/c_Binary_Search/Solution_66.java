package c_Binary_Search;

public class Solution_66 {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int Floor = floor(nums,x);
        int Ceil = ceil(nums,x);
        return new int[]{Floor,Ceil};
    }
    static int floor(int[]arr,int x){
        int n= arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    static int ceil(int[] arr,int x){
        int n = arr.length;
        int low=0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>=x){
                ans= arr[mid];
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int[] arr1 ={3, 4, 4, 7, 8, 10};
        int[] arrans= getFloorAndCeil(arr,5);
        int[] arr1ans= getFloorAndCeil(arr1,8);
        for(int e:arrans){
            System.out.print(e+" ");
        }
        System.out.println();
        for(int e:arr1ans){
            System.out.print(e+" ");
        }
    }
}
