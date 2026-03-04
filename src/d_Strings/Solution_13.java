package d_Strings;

public class Solution_13 {
    /*
    Problem:
    Longest Palindromic Substring

    Idea (Center Expansion Approach):
    - Har index ko palindrome ka "center" maan ke expand karte hain
    - 2 cases handle karte hain:
      1️⃣ Odd length palindrome  -> center ek character (i, i)
      2️⃣ Even length palindrome -> center do characters ke beech (i, i+1)
    - Jab tak left aur right characters equal hain, expand karte jao
    - Har baar max length update karte jao
   */
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;
        int start = 0, maxLen = 1;
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(start, start + maxLen);
        }
    }

