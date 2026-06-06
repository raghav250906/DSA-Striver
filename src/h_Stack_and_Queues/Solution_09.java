package h_Stack_and_Queues;
import java.util.*;
public class Solution_09 {
    public static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> list= new ArrayList<>();
        int n=arr.length;
        int[] ans= new int[n];
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i]=-1;
                s.push(arr[i]);
            }
            else if(s.peek()<arr[i]){
                ans[i]=s.peek();
                s.push(arr[i]);
            }
            else{
                while(!s.isEmpty() && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                    s.push(arr[i]);
                }
                else{
                    ans[i]=s.peek();
                    s.push(arr[i]);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            list.add(ans[i]);
        }
        return list;
    }
}
