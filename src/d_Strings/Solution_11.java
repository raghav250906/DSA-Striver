package d_Strings;

public class Solution_11 {
    public int myAtoi(String s) {
            /*
             * Question:
             * Ek string di hui hai, use integer me convert karna hai
             * following the atoi rules.
             *
             * Atoi Rules:
             * 1. Leading spaces ignore karo.
             * 2. Optional '+' ya '-' sign handle karo.
             * 3. Digits read karo jab tak valid digits milti rahein.
             * 4. Overflow ho to Integer.MAX_VALUE / MIN_VALUE return karo.
             *
             * Example:
             * Input  : "   -42"
             * Output : -42
             *
             * Input  : "4193 with words"
             * Output : 4193
             *
             * Logic / Approach:
             * 1. Pointer i se string traverse karo.
             * 2. Pehle spaces skip karo.
             * 3. Sign check karo (+ / -).
             * 4. Digit milte hi number banana start karo.
             * 5. Har step pe overflow check karo.
             *
             * Time Complexity: O(n)
             * Space Complexity: O(1)
             */

        int n = s.length();
        int sign = 1;
        int i = 0;
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)(sign * result);
    }
}
