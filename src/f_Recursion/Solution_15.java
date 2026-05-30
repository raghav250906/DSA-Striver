/*
Problem: N Queens ko chessboard par aise place karna hai
ki koi bhi queen ek dusre ko attack na kare.

Conditions:
- Same Row ❌
- Same Column ❌
- Same Diagonal ❌

Logic (Backtracking):

1. Ek row me sirf ek queen place karte hain.

2. Base Case:
   - Agar row == n
     → saari queens successfully place ho gayi
     → current board answer me add karo.

3. Current row ke har column ko try karo.

4. Safe Position Check:
   - Same column me queen nahi honi chahiye.
   - Upper-left diagonal me queen nahi honi chahiye.
   - Upper-right diagonal me queen nahi honi chahiye.

5. Place Queen:
   - arr[row][col] = 'Q'

6. Next row ke liye recursion call.

7. Backtrack:
   - Queen remove karo
   - arr[row][col] = '.'

Time Complexity: O(N!)
Space Complexity: O(N²) board + O(N) recursion stack
*/

package f_Recursion;
import java.util.*;
public class Solution_15 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr= new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        backTrack(0,arr,ans);
        return ans;
    }
    static void backTrack(int row,char[][]arr,List<List<String>>ans){
        if(row==arr.length){
            List<String> curr = new ArrayList<>();
            for(char[] r : arr) {
                curr.add(new String(r));
            }
            ans.add(curr);
            return;
        }
        for(int col=0;col<arr.length;col++){
            if(isPlace(arr,row,col)){
                arr[row][col]='Q';
                backTrack(row+1,arr,ans);
                arr[row][col]='.';
            }
        }
    }
    static boolean isPlace(char[][]arr,int row,int col){
        //colomn
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        //upper left diagonal
        for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        //upper right diagonal
        for(int i=row-1, j =col+1; i>=0 && j<arr.length; i--,j++) {
            if(arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
