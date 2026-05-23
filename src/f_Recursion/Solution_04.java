/*
Problem: Count total good numbers of length n.

Good Number Rules:
- Even index pe only even digits allowed:
  {0,2,4,6,8} → 5 choices
- Odd index pe only prime digits allowed:
  {2,3,5,7} → 4 choices

Logic:

1. Count positions:
   - evenPos = (n+1)/2
   - oddPos = n/2

2. Total combinations:
   - even positions → 5^evenPos
   - odd positions → 4^oddPos

3. Final Answer:
   - (5^evenPos * 4^oddPos) % MOD

4. Fast Power:
   - Binary Exponentiation use kiya hai
     taaki large powers efficiently calculate ho sake.

Important:
- MOD use kiya hai overflow avoid karne ke liye.

Time Complexity: O(log N)
Space Complexity: O(log N)
*/

package f_Recursion;
public class Solution_04 {
    static long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenPos= (n+1)/2;
        long oddPos= n/2;
        long even = fastPow(5,evenPos);
        long odd = fastPow(4,oddPos);
        System.out.print(even+" "+odd);
        return (int) ((even*odd) % MOD);
    }
    static long fastPow(long n,long pow){
        if(pow==0){
            return 1;
        }
        if(pow%2==0){
            pow/=2;
            n= (n*n) % MOD;
            return fastPow(n,pow);
        }
        else return (n*fastPow(n*n%MOD,pow/2)%MOD);
    }
}
