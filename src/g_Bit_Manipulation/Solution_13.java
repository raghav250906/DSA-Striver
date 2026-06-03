/*
Problem: Kisi number ke saare divisors
ascending order me find karne hain.

Logic (Square Root Optimization):

1. Har divisor pair me aata hai:

   i × (n / i) = n

2. Isliye sirf √n tak iterate karna
   sufficient hota hai.

3. Agar n % i == 0:

   - i ek divisor hai.
   - n / i bhi ek divisor hai.

4. Dono divisors list me add karo.

5. Perfect square case me:

   - i == n / i hoga.
   - Duplicate add nahi karna.

6. End me list sort karke
   ascending order me return kar do.

Time Complexity: O(√N + K log K)
K = total divisors

Space Complexity: O(K)
*/

package g_Bit_Manipulation;
import java.util.*;
public class Solution_13 {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
