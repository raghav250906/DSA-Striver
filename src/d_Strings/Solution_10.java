package d_Strings;

public class Solution_10 {
    /*
     * Question:
     * Roman numeral string ko integer me convert karna hai.
     *
     * Example:
     * Input  : "MCMXCIV"
     * Output : 1994
     *
     * Roman Rules:
     * - Normally left se right add karte hain.
     * - Agar current value next se chhoti ho
     *   to subtract karna hota hai.
     *   (jaise: IV = 4, IX = 9)
     *
     * Logic / Approach:
     * 1. Har Roman character ki value map kar di.
     * 2. String ko left se right traverse kiya.
     * 3. Current aur next value compare ki:
     *    - curr < next → subtract
     *    - warna add
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    private int value(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        else return 1000;
    }

    public int romanToInt(String s) {
        int n= s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            int curr = value(s.charAt(i));
            int next = 0;
            if(i+1<n){
                next = value(s.charAt(i+1));
            }
            if(curr < next){
                ans-=curr;
            }
            else ans+=curr;
        }
        return ans;
    }
}
