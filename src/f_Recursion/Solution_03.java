/*
Problem: x^n calculate karna hai efficiently.

Logic (Binary Exponentiation / Fast Power):

1. Negative Power Handle:
   - Agar n negative hai:
       → x = 1/x
       → n ko positive bana do

2. Base Case:
   - Agar n == 0 → answer = 1

3. Divide and Conquer:
   - half = fastPow(x, n/2)

4. Even Power:
   - x^n = half * half

5. Odd Power:
   - x^n = half * half * x

Important:
- Har step pe power half ho rahi hai,
  isliye normal O(N) se faster hai.

Time Complexity: O(log N)
Space Complexity: O(log N) recursion stack
*/

package f_Recursion;
public class Solution_03 {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }
}
