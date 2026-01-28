package d_Strings;

public class Solution_09 {
    public int maxDepth(String s) {
        /*
         * Question:
         * Ek valid parentheses string di hui hai.
         * Uski maximum nesting depth find karni hai.
         *
         * Example:
         * s = "(1+(2*3)+((8)/4))+1"
         * Output = 3
         *
         * Logic / Approach:
         * 1. Ek counter variable `count` rakhenge:
         *    '(' aaye → count++
         *    ')' aaye → count--
         *
         * 2. Har step par max depth ko update karte rahenge.
         * 3. `count` current depth show karta hai,
         *    aur `max` maximum depth track karta hai.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int n = s.length();
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
            }
            max= Math.max(count,max);
        }
        return max;
    }
}
