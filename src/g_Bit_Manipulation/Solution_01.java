/*
Problem: Check karna hai ki number n ka kth bit set (1) hai ya nahi.

Logic (Bit Manipulation):

1. (1 << k)
   - kth position par 1 le aata hai.

2. n & (1 << k)
   - Agar kth bit set hai
     → result non-zero hoga.

3. Agar result != 0
   → kth bit set hai → true

4. Warna
   → kth bit unset hai → false

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_01 {
    public static boolean checkKthBit(int n, int k) {
        if((n&(1<<k))!=0) return true;
        return false;
    }
}
