/*
Problem: Check karna hai ki given word board me exist karta hai ya nahi.
Movement sirf Up, Down, Left, Right allowed hai.
Ek cell ko ek path me sirf ek baar use kar sakte hain.

Logic (Backtracking + DFS):

1. Har cell ko starting point maan kar check karo.

2. Agar current cell word ke first character se match kare
   → DFS search start karo.

3. Base Case:
   - Agar curr == word.length()-1
     → poora word mil gaya
     → return true

4. 4 Directions explore karo:
   - Right
   - Left
   - Up
   - Down

5. Move karne se pehle:
   - Boundary check
   - Character match check
   - Visited check

6. Pick:
   - Cell ko visited mark karo.

7. Recursive Call:
   - Next character search karo.

8. Backtrack:
   - Agar path fail ho jaye
     → visited false kar do
     → doosra path try karo.

Time Complexity: O(M * N * 4^L)
L = word length

Space Complexity: O(M * N) visited array
+ O(L) recursion stack
*/

package f_Recursion;
public class Solution_14 {
    public boolean exist(char[][] board, String word) {
        int m= board.length;
        int n= board[0].length;
        boolean[][] visited= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                visited[i][j]=true;
                if(board[i][j]==word.charAt(0) && search(0,i,j,board,word,visited)){
                    return true;
                }
                visited[i][j]=false;
            }
        }
        return false;
    }
    static boolean search(int curr,int i,int j,char[][] board,String word,boolean[][] visited){
        if(curr==word.length()-1){
            return true;
        }
        //right
        if(j+1<= board[0].length-1 && board[i][j+1]==word.charAt(curr+1) && !visited[i][j+1]){
            visited[i][j+1]=true;
            if(search(curr+1,i,j+1,board,word,visited)) return true;
            visited[i][j+1]=false;
        }
        //left
        if(j-1>=0 && board[i][j-1]==word.charAt(curr+1) && !visited[i][j-1]){
            visited[i][j-1]=true;
            if(search(curr+1,i,j-1,board,word,visited)) return true;
            visited[i][j-1]=false;
        }
        //top
        if(i-1>=0 && board[i-1][j]==word.charAt(curr+1) && !visited[i-1][j]){
            visited[i-1][j]=true;
            if(search(curr+1,i-1,j,board,word,visited)) return true;
            visited[i-1][j]=false;
        }
        //down
        if(i+1<= board.length-1 && board[i+1][j]==word.charAt(curr+1) && !visited[i+1][j]){
            visited[i+1][j]=true;
            if(search(curr+1,i+1,j,board,word,visited)) return true;
            visited[i+1][j]=false;
        }
        return false;
    }
}
