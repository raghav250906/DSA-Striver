/*
Problem: Array me do elements sirf ek baar aaye hain,
baaki saare elements exactly do baar aaye hain.
Dono unique elements find karne hain.

Logic (Bit Manipulation):

1. Saare elements ka XOR lo.

2. Duplicate elements cancel ho jayenge
   aur result = unique1 ^ unique2 bachega.

3. XOR me koi na koi bit set hogi
   jahan dono unique numbers different honge.

4. Rightmost set bit nikaalo:

   right = (xor & (xor - 1)) ^ xor

5. Is bit ke basis par array ko
   do groups me divide karo.

   - Bit set wale group
   - Bit unset wale group

6. Har group ka XOR lo.

7. Duplicate elements apne group me
   cancel ho jayenge.

8. Dono groups se hume dono
   unique numbers mil jayenge.

Time Complexity: O(N)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;

public class Solution_11 {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int right = (xor&(xor-1)) ^ xor;
        int b1=0;
        int b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&right) != 0){
                b1^=nums[i];
            }
            else b2^=nums[i];
        }
        return new int[]{b1,b2};
    }
}
