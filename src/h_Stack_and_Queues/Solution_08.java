package h_Stack_and_Queues;
import java.util.*;
public class Solution_08 {
    public int[] nextGreaterElements(int[] arr) {
        int n= arr.length;
        int[] ans = new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int ind= i%n;
            if(s.isEmpty()){
                s.push(arr[ind]);
                ans[ind]=-1;
            }
            else if(s.peek()>arr[ind]){
                ans[ind]=s.peek();
                s.push(arr[ind]);
            }
            else{
                while(!s.isEmpty() && s.peek()<=arr[ind]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[ind]=-1;
                    s.push(arr[ind]);
                }
                else{
                    ans[ind]=s.peek();
                    s.push(arr[ind]);
                }
            }
        }
        return ans;
    }
}
