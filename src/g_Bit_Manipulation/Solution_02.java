/*
Problem: Check karna hai ki given number even hai ya odd.

Logic (Bit Manipulation):

1. Binary representation me:
   - Even number ka last bit = 0
   - Odd number ka last bit = 1

2. (n & 1) perform karo:
   - Agar result 0 aata hai
     → number even hai.

   - Agar result 1 aata hai
     → number odd hai.

3. Function true return karta hai
   sirf jab number even ho.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_02 {
    static boolean isEven(int n) {
        return (n&1)==0;
    }
}
