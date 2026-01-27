package d_Strings;

public class Solution_07 {
    /*
     * Question:
     * Check karna hai ki string s aur t anagram hain ya nahi.
     * Anagram ka matlab:
     * - Dono strings me same characters hone chahiye
     * - Same frequency ke saath
     *
     * Example:
     * s = "anagram", t = "nagaram" → true
     * s = "rat", t = "car" → false
     *
     * Logic / Approach:
     * 1. Agar lengths same nahi hain → anagram possible hi nahi.
     * 2. 26 size ka frequency array use kiya (sirf lowercase letters).
     * 3. s ke characters ke liye frequency increment ki.
     * 4. t ke characters ke liye frequency decrement ki.
     * 5. End me agar kisi index par non-zero value mili
     *    matlab frequency match nahi karti → false.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1) (fixed size array use ho rahi)
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count != 0) return false;
        }
        return true;
    }
}
