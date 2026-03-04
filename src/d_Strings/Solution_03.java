package d_Strings;

public class Solution_03 {

    public static void main(String[] args) {
        String s = "10";
        System.out.println(largeOddNum(s));
    }
    public static String largeOddNum(String s) {
        /*
         * Question:
         * Ek numeric string di hui hai.
         * Hume largest possible odd number return karna hai
         * (leading zeros allowed nahi hone chahiye).
         *
         * Example:
         * Input  : "10"
         * Output : ""
         *
         * Input  : "5043"
         * Output : "5043"
         *
         * Logic / Approach:
         * 1. Pehle string ke starting ke leading zeros skip karte hain.
         * 2. Phir left se right traverse karke
         *    last odd digit ka index store karte hain.
         * 3. Agar koi odd digit nahi milta → return empty string.
         * 4. Warna substring(from, lastOddIndex + 1) return kar dete hain.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1) (extra space use nahi ho rahi)
         */

        int n= s.length();
        int from= 0;
        int to = -1;
        while(from<n && s.charAt(from)=='0'){
            from++;
        }
        for(int i=from;i<n;i++){
            int digit = s.charAt(i) - '0';
            if(digit % 2 != 0){
                to = i;
            }
        }
        if(to==-1) return "";
        return s.substring(from,to+1);
    }
}
