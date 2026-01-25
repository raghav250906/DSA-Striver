package b_Arrays;

public class Solution_48 {
    public static void setZeroes(int[][] matrix) {
//        // Get number of rows
//        int m = matrix.length;
//        // Get number of columns
//        int n = matrix[0].length;
//
//        // First pass: mark rows and columns
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                // If the cell is zero
//                if (matrix[i][j] == 0) {
//                    // Mark entire row as -1 (except zeros)
//                    for (int col = 0; col < n; col++) {
//                        if (matrix[i][col] != 0)
//                            matrix[i][col] = -1;
//                    }
//                    // Mark entire column as -1 (except zeros)
//                    for (int row = 0; row < m; row++) {
//                        if (matrix[row][j] != 0)
//                            matrix[row][j] = -1;
//                    }
//                }
//            }
//        }
//
//        // Second pass: replace -1 with 0
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == -1)
//                    matrix[i][j] = 0;
//            }
//        }
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRow= true;
                break;
            }
        }
        for(int j=0;j<m;j++){
            if(matrix[j][0]==0){
                firstCol=true;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int j=0;j<m;j++){
                matrix[j][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

