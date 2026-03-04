package b_Arrays;

public class Solution_49 {
    public static void rotateMatrix(int[][] matrix) {
//        int m= matrix.length;
//        int n=matrix[0].length;
//        int[][] matrix1= new int[n][m];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                matrix1[j][(m-1)-i]=matrix[i][j];
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                matrix[i][j]=matrix1[i][j];
//            }
//        }
        int m= matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<m;i++){
            reverseRow(matrix,i);
        }
    }
    static void reverseRow(int[][] matrix,int i){
        int n=matrix[0].length;
        int low=0;
        int high=n-1;
        while(low<high){
            int temp= matrix[i][low];
            matrix[i][low]=matrix[i][high];
            matrix[i][high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5},{1,2,3,4}};
        rotateMatrix(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

