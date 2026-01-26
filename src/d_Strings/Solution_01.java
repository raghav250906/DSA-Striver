package d_Strings;

public class Solution_01 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("((()))"));
    }

    public static String removeOuterParentheses(String s){
        /*
         * Question:
         * Given ek valid parentheses string hai.
         * Har primitive parentheses string ke outermost brackets remove karne hain.
         *
         * Example:
         * Input  : "((()))"
         * Output : "(())"
         *
         * Logic / Approach:
         * 1. Ek balance variable maintain karte hain:
         *    '(' aaye → balance++
         *    ')' aaye → balance--
         *
         * 2. '(' tabhi add karte hain jab balance > 0 ho
         *    → matlab outermost '(' skip ho jaye.
         *
         * 3. ')' tabhi add karte hain jab balance > 0 ho
         *    → matlab outermost ')' skip ho jaye.
         *
         * 4. Is tarah har primitive ke outer brackets remove ho jaate hain.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

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
