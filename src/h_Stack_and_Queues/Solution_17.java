package h_Stack_and_Queues;
import java.util.*;
public class Solution_17 {
    public int maximalRectangle(char[][] mat) {
        int n= mat.length;
        int[][] pSum= prefixSum(mat);
        int max=0;
        for(int i=0;i<n;i++){
            max= Math.max(max,lRArea(pSum[i]));
        }
        return max;

    }
    static int[][] prefixSum(char[][] mat){
        int n= mat.length;
        int m= mat[0].length;
        int[][] pS= new int[n][m];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                int a= mat[j][i] - '0';
                sum+=a;
                if(a==0) sum=0;
                pS[j][i]=sum;
            }
        }
        return pS;
    }
    static int lRArea(int[] arr) {
        int n= arr.length;
        Stack<Integer> s= new Stack<>();
        int max=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                int e= s.peek();
                s.pop();
                int nse= i;
                int pse= s.isEmpty()?-1:s.peek();
                max=Math.max(max,arr[e]*(nse-pse-1));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int nse=n;
            int e= s.peek();
            s.pop();
            int pse= s.isEmpty()?-1:s.peek();
            max=Math.max(max,arr[e]*(nse-pse-1));
        }
        return max;
    }
}
