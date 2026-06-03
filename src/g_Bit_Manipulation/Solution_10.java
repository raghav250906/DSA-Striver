/*
Problem: Range [L, R] ka XOR find karna hai.

Logic (XOR Pattern):

1. Direct XOR nikalna O(N) lega.

2. XOR(1 to N) ka ek fixed pattern hota hai:

   N % 4 == 0 → N
   N % 4 == 1 → 1
   N % 4 == 2 → N + 1
   N % 4 == 3 → 0

3. Is pattern ki help se XOR(1 to N)
   O(1) time me nikal sakte hain.

4. Range XOR nikalne ka formula:

   XOR(L to R)
   = XOR(1 to R) ^ XOR(1 to L-1)

5. Common values cancel ho jaati hain
   kyunki a ^ a = 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_10 {
    public static int findXOR(int l, int r) {
        return xor1ToN(l-1) ^ xor1ToN(r);
    }
    static int xor1ToN(int n){
        if(n%4==0) return n;
        else if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else return 0;
    }
}
