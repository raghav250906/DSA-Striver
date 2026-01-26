package d_Strings;

public class Solution_04 {
    /*
     * Question:
     * Ek string array di hui hai.
     * Sab strings ka longest common prefix find karna hai.
     *
     * Example:
     * Input  : ["flower","flow","flight"]
     * Output : "fl"
     *
     * Logic / Approach:
     * 1. Pehli string ko initial prefix maan lete hain.
     * 2. Har next string ke saath check karte hain
     *    ki prefix uske start me exist karta hai ya nahi.
     * 3. Agar nahi karta, to prefix ka last character hata dete hain.
     * 4. Ye process tab tak repeat hota hai jab tak prefix match na kare
     *    ya prefix empty na ho jaaye.
     *
     * Time Complexity: O(n * m)
     *   n = number of strings
     *   m = prefix length
     *
     * Space Complexity: O(1)
     */

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] str) {
        if(str == null || str.length == 0) return "";
        String prefix = str[0];
        for(int i=0; i<str.length;i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
