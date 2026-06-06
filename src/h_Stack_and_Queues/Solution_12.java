package h_Stack_and_Queues;
import java.util.*;
public class Solution_12 {
    public int[] asteroidCollision(int[] arr) {
        int n= arr.length;
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }
            else if(s.peek()<0 || arr[i]>0){
                s.push(arr[i]);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && Math.abs(arr[i]) > Math.abs(s.peek())){
                    s.pop();
                }
                if(s.isEmpty() || s.peek() < 0) {
                    s.push(arr[i]);
                }
                else if(Math.abs(arr[i]) == Math.abs(s.peek())) {
                    s.pop();
                }
            }

        }
        int[] ans = new int[s.size()];
        int i=ans.length-1;
        while(!s.isEmpty()){
            ans[i--]=s.pop();
        }
        return ans;
    }
    static int sign(int n){
        if(n>=0) return 1;
        return 0;
    }
}
