package c_Binary_Search;

public class Solution_92 {
    public static void main(String[] args) {
        int[][] arr ={{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        int[] ans = findPeakGrid(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int maxElement(int[][] mat, int col){
        int max = Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid =(low+high)/2;
            int row = maxElement(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1] : Integer.MIN_VALUE;
            int right = mid+1<m ? mat[row][mid+1] : Integer.MIN_VALUE;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            }
            if(mat[row][mid]<left){
                high=mid-1;
            }
            else low=mid+1;
        }
         return new int[] {-1,-1};
    }
}
