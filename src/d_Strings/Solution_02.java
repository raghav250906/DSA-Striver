package d_Strings;

public class Solution_02 {
    /*
     * Question:
     * Ek string di hui hai, words ka order reverse karna hai.
     * Extra spaces ignore karni hain.
     *
     * Example:
     * Input  : "welcome to the jungle"
     * Output : "jungle the to welcome"
     *
     * Logic / Approach:
     * 1. String ko end se traverse karte hain.
     * 2. Pehle extra spaces skip kar dete hain.
     * 3. Phir ek word identify karte hain (space aane tak).
     * 4. Word ko StringBuilder me add karte hain.
     * 5. Words ke beech sirf ek space add karte hain.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    public static void main(String[] args) {
        String s ="welcome to the jungle";
        String a =reverseWords(s);
        System.out.println(a);
    }
    public static String reverseWords(String s) {
        int n = s.length();
        int i=n-1;
        StringBuilder ans = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if(ans.length()>0) ans.append(" ");
            ans.append(s.substring(i+1,j+1));
        }
        return ans.toString();
    }
}
