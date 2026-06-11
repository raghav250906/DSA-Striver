package h_Stack_and_Queues;
import java.util.Stack;

public class Solution_16 {
    public int largestRectangleArea(int[] arr) {
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
    //brute force
    // public int largestRectangleArea(int[] arr) {
    //     int[] nse= nSE(arr);
    //     int[] pse= pSE(arr);
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         long area= (nse[i] - pse[i] -1)*arr[i];
    //         max= Math.max(max,(int)area);
    //     }
    //     return max;
    // }
    // static int[] nSE(int[] arr){
    //     int[] a= new int[arr.length];
    //     int n= arr.length;
    //     Stack<Integer> s= new Stack<>();
    //     for(int i=n-1;i>=0;i--){
    //         while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
    //             s.pop();
    //         }
    //         if(s.isEmpty()){
    //             a[i]=n;
    //             s.push(i);
    //         }
    //         else{
    //             a[i]=s.peek();
    //             s.push(i);
    //         }
    //     }
    //     return a;
    // }
    // static int[] pSE(int[] arr){
    //     int[] a= new int[arr.length];
    //     int n= arr.length;
    //     Stack<Integer> s= new Stack<>();
    //     for(int i=0;i<n;i++){
    //         while(!s.isEmpty() && arr[s.peek()]>arr[i]){
    //             s.pop();
    //         }
    //         if(s.isEmpty()){
    //             a[i]=-1;
    //             s.push(i);
    //         }
    //         else{
    //             a[i]=s.peek();
    //             s.push(i);
    //         }
    //     }
    //     return a;
    // }
}
