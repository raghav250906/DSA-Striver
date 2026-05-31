/*
Problem: Number me total kitne set bits (1's) hain,
ye count karna hai.

Logic (Brian Kernighan's Algorithm):

1. Jab tak n != 0:
   - Ek set bit remove karo using:
     n = n & (n - 1)

2. Har iteration me exactly ek set bit remove hoti hai.

3. Count ko increment karte jao.

4. Jab n = 0 ho jaye
   → saari set bits count ho chuki hongi.

Time Complexity: O(Number of Set Bits)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_04 {
    static int setBits(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=(n&(n-1));
        }
        return count;
    }
}
