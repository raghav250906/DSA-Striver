package d_Strings;

public class Solution_06 {
    /*
     * Question:
     * Check karna hai ki goal string,
     * string s ko rotate karke ban sakti hai ya nahi.
     *
     * Example:
     * s = "abcde", goal = "cdeab" → true
     * s = "abcde", goal = "abced" → false
     *
     * Logic / Approach:
     * Approach 1 (Brute Force) – TLE prone ❌
     * - Har rotation generate ki
     * - Har rotation ko goal se compare kiya
     * - Time Complexity: O(n²)
     * - Large input pe Time Limit Exceed ho sakta hai
     *
     * Approach 2 (Optimized) – Preferred ✅
     * - s + s me goal check kiya
     * - Time Complexity: O(n)
     * - Interview / Contest friendly approach
     *
     * Explanation:
     * s = "abcde"
     * s+s = "abcdeabcde"
     * Isme "cdeab" present hai → valid rotation
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
//        int n=s.length();
//        for(int i=0; i<n;i++){
//            String t = s.substring(i) + s.substring(0,i);
//            if(t.equals(goal)){
//                return true;
//            }
//        }
//        return false;
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
    /*
    * GFG pr s+s approach bhi TLE dega uske lia ye approch use hoga
    *
    public boolean areRotations(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String text = s + s;
        return kmpSearch(text, goal);
    }

    private boolean kmpSearch(String text, String pattern) {
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) return true;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] buildLPS(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        int len = 0, i = 1;

        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = 0;
                }
            }
        }
        return lps;
    }
     */
}
