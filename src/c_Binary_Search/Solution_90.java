package c_Binary_Search;

public class Solution_90 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(searchMatrix(arr,8));
    }
    static boolean isFound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                return true;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
            else low=mid+1;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] mat, int target) {
        int m=mat[0].length;
        int row=-1;
        int low=0;
        int high= mat.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(mat[mid][0]<=target && mat[mid][m-1]>=target){
                row=mid;
                break;
            }
            else if(mat[mid][0]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        if(row==-1){
            return false;
        }
        return isFound(mat[row],target);
    }
}
