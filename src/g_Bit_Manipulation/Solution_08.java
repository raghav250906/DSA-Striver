/*
Problem: Array me har element 2 baar aata hai,
sirf ek element 1 baar aata hai.
Us unique element ko find karna hai.

Logic (Bit Manipulation - XOR):

1. XOR ki important properties:

   a ^ a = 0
   a ^ 0 = a

2. Array ke saare elements ka XOR karo.

3. Jo elements 2 baar aayenge:
   - Ek dusre ko cancel kar denge.

4. Sirf unique element bachega.

Time Complexity: O(N)
Space Complexity: O(1)
*/
package g_Bit_Manipulation;
public class Solution_08 {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int e:nums){
            xor ^= e;
        }
        return xor;
    }
}
