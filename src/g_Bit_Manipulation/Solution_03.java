/*
Problem: Check karna hai ki given number power of 2 hai ya nahi.

Logic (Bit Manipulation):

1. Power of 2 numbers me sirf ek hi bit set hoti hai.

Examples:
1  -> 0001
2  -> 0010
4  -> 0100
8  -> 1000

2. Agar kisi power of 2 number me se 1 subtract karo:
   - Set bit ke right side ke saare bits 1 ban jate hain.

Example:
8      = 1000
8 - 1  = 0111

3. n & (n-1) karo:
   - Power of 2 ke liye result hamesha 0 aayega.

4. Special Case:
   - n <= 0 kabhi bhi power of 2 nahi hota.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_03 {
    public static boolean isPowerofTwo(int n) {
        if(n<=0) return false;
        return (n&(n-1))==0;
    }
}
