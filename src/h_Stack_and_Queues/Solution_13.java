package h_Stack_and_Queues;
import java.util.*;
public class Solution_13 {
    public int sumSubarrayMins(int[] arr) {
        int n= arr.length;
        int[] nse= nextSmallestElement(arr);
        int[] psee= previousSmallestOrEqualElement(arr);
        long total=0;
        long mod= 1000000007;
        for(int i=0;i<n;i++){
            int left= i-psee[i];
            int right= nse[i]-i;
            total = (total + ((long)left*right*arr[i])%mod)%mod;
        }
        return (int)total;
    }
    static int[] nextSmallestElement(int[] arr){
        int n= arr.length;
        int[] nse = new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            nse[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return nse;
    }
    static int[] previousSmallestOrEqualElement(int[] arr){
        int n=arr.length;
        int[] psee= new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            psee[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return psee;
    }
}
