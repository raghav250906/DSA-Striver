package d_Strings;

import java.util.HashMap;

public class Solution_05 {
    /*
     * Question:
     * Do strings s aur t isomorphic hain ya nahi check karna hai.
     * Isomorphic ka matlab:
     * - Har character ka mapping unique hona chahiye
     * - One-to-one mapping honi chahiye
     *
     * Example:
     * s = "egg", t = "add"  → true
     * s = "foo", t = "bar"  → false
     *
     * Logic / Approach:
     * 1. Agar length same nahi hai → directly false.
     * 2. Do HashMap use karte hain:
     *    - mapS : s → t mapping check karega
     *    - mapT : t → s mapping check karega
     * 3. Har index par:
     *    - Agar mapping pehle se exist karti hai aur match nahi karti → false.
     *    - Warna nayi mapping store kar do.
     * 4. Dono side se mapping correct rahi to strings isomorphic hain.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static void main(String[] args) {
        String s = "";
        String t = "";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mapS.containsKey(s.charAt(i))){
                if(mapS.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                mapS.put(s.charAt(i),t.charAt(i));
            }
            if(mapT.containsKey(t.charAt(i))){
                if(mapT.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                mapT.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
