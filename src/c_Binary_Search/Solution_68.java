package c_Binary_Search;

public class Solution_68 {
    public int countOccurrences(int[] arr, int target) {
        int first= firstOcc(arr,target);
        int last = lastOcc(arr,target);
        return last-first+1;
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
