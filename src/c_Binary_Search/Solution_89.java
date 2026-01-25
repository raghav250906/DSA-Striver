package c_Binary_Search;

public class Solution_89 {
    public static void main(String[] args) {
        int[][] arr = { {0, 0, 0}, {0, 0, 0}};
        System.out.println(rowWithMax1s(arr));
    }
    static int firstOcc(int[] arr,int length,int x){
        int low=0;
        int high=length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                high = mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
    public static int rowWithMax1s(int[][] mat) {
//        int n = mat.length;
//        int m = mat[0].length;
//        int index = -1;
//        int noOfOnes = 0;
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < m; j++) {
//                if (mat[i][j] == 1) count++;
//            }
//            if (count > noOfOnes) {
//                noOfOnes = count;
//                index = i;
//            }
//        }
//        return index;
        int n= mat.length;
        int m= mat[0].length;
        int index = -1;
        int maxCount = 0;
        for(int i=0;i<n;i++){
            int count= m-firstOcc(mat[i],m,1);
            if(maxCount<count){
                maxCount=count;
                index=i;
            }
        }
        return index;
    }
}
