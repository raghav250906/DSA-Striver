/*
Problem: Do variables ko third variable use kiye bina swap karna hai.

Logic (XOR Swap):

1. a = a ^ b
   - a me dono numbers ka XOR store ho jata hai.

2. b = b ^ a
   - Original a ki value b me aa jati hai.

3. a = a ^ b
   - Original b ki value a me aa jati hai.

4. Dono values successfully swap ho jati hain.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package g_Bit_Manipulation;
public class Solution_06 {
    public void swap(int a, int b) {
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
