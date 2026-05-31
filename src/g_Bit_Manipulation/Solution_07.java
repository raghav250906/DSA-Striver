/*
Problem: Start number ko Goal number me convert karne ke liye
minimum kitne bit flips chahiye, ye find karna hai.

Logic (Bit Manipulation):

1. start ^ goal karo.
   - Jitni bits different hongi,
     un positions par result me 1 aayega.

2. Ab problem reduce ho gayi:
   - XOR result me kitne set bits hain?

3. Brian Kernighan's Algorithm use karo:
   - n = n & (n - 1)
   - Har iteration me ek set bit remove hoti hai.

4. Total set bits count karo.
   - Yehi minimum bit flips honge.

Time Complexity: O(Number of Different Bits)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_07 {
    public int minBitFlips(int start, int goal) {
        int ans= start^goal;
        int count=0;
        while(ans!=0){
            count++;
            ans=(ans&(ans-1));
        }
        return count;
    }
}
