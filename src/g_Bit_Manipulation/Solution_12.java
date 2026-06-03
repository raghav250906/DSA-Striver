/*
Problem: Division operator (/, %, *) use kiye bina
dividend / divisor ka quotient find karna hai.

Logic (Bit Manipulation):

1. Pehle result ka sign determine karo.

   - Same sign => positive answer
   - Different sign => negative answer

2. Overflow handle karne ke liye
   values ko long me convert karo.

3. Dividend aur divisor ka absolute value lo.

4. Jab tak dividend >= divisor:

   - Divisor ko left shift karke
     maximum possible multiple find karo.

   - Matlab largest (divisor * 2^cnt)
     jo dividend se chhota ya equal ho.

5. Quotient me 2^cnt add karo.

6. Dividend se shifted divisor subtract kar do.

7. Process repeat karo jab tak
   dividend divisor se chhota na ho jaye.

8. End me sign apply karo.

9. Integer overflow case:

   - Positive overflow => Integer.MAX_VALUE
   - Negative overflow => Integer.MIN_VALUE

Time Complexity: O(log²N)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_12 {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        boolean sign = true;
        if(dividend<=0 && divisor>0) sign=false;
        if(dividend>=0 && divisor<0) sign=false;
        long a= Math.abs((long)dividend);
        long b= Math.abs((long)divisor);
        long ans=0;
        while(a>=b){
            int cnt=0;
            while(a>= b<<(cnt+1)){
                cnt++;
            }
            ans += (1<<cnt);
            a -= (b<<cnt);
        }
        if(ans==(1<<31) && sign){
            return Integer.MAX_VALUE;
        }
        if(ans==(1<<31) && !sign){
            return Integer.MIN_VALUE;
        }
        return sign ? (int)ans:(int)-ans;
    }
}
