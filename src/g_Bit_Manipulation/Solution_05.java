/*
Problem: Number me rightmost unset bit (0) ko set (1) karna hai.

Logic (Bit Manipulation):

1. n + 1 karo.
   - Ye rightmost unset bit ko affect karta hai.

2. n | (n + 1) perform karo.
   - OR operation se rightmost unset bit set ho jati hai.

3. Result return kar do.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_05 {
    public int setBit(int n) {
        return (n | (n + 1));
    }
}
