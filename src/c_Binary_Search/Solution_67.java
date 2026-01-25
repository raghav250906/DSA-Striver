package c_Binary_Search;

public class Solution_67 {
    public static void main(String[] args) {
        int[] arr={5, 7, 7, 8, 8, 10};
        int[] arr1= searchRange(arr,8);
        for(int e:arr1){
            System.out.print(e+" ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        if(firstOcc(nums,target)==-1) return new int[] {-1,-1};
        return new int[] {firstOcc(nums,target),lastOcc(nums,target)};
    }
    static int firstOcc(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if (arr[mid]>x){
                high=mid-1;
            }
            else low=mid+1;
        }
        return first;
    }
    static int lastOcc(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if (arr[mid]>x){
                high=mid-1;
            }
            else low=mid+1;
        }
        return last;
    }
}
