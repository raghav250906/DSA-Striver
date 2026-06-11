package h_Stack_and_Queues;
import java.util.*;
public class Solution_15 {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<num.length();i++){
            int n= num.charAt(i)-'0';
            while(!s.isEmpty() && k>0 && s.peek()>n){
                s.pop();
                k--;
            }
            s.push(n);
        }
        if(s.isEmpty() || num.length()==k) return "0";
        String ans ="";
        while(k>0 && !s.isEmpty()){
            s.pop();
            k--;
        }
        while(!s.isEmpty() && s.get(0)==0){
            s.remove(0);
        }
        if(s.isEmpty()) return "0";
        while(!s.isEmpty()){
            String ch = String.valueOf(s.pop());
            ans+=ch;
        }
        ans = new StringBuilder(ans).reverse().toString();
        return ans;
    }
}
