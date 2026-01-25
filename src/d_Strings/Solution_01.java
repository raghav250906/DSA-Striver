package d_Strings;

public class Solution_01 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("((()))"));
    }

    public static String removeOuterParentheses(String s){
        int balance=0;
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(balance>0){
                    ans.append(ch);
                }
                balance++;
            }
            else{
                balance--;
                if(balance>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
