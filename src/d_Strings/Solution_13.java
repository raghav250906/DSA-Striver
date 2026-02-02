package d_Strings;

public class Solution_13 {
    /*
     Problem:
     Beauty Sum of All Substrings

     Beauty of a substring =
     (maximum frequency of any character)
       -
     (minimum frequency of any character, ignoring 0)

     Approach (Brute Force but Optimized):
     - Har possible substring consider karni hai
     - Start index i fix karo
     - End index j ko aage badhate jao
     - Ek freq[26] array rakho jo current substring ke
       character counts store kare
     - Har extension pe:
         maxFreq aur minFreq (non-zero) nikaalo
         beauty += (maxFreq - minFreq)
    */

    public int beautySum(String s) {
        int n = s.length();
        int beauty = 0;
        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j) - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        maxFreq = Math.max(maxFreq,freq[k]);
                        minFreq = Math.min(minFreq,freq[k]);
                    }
                }
                beauty += (maxFreq - minFreq);
            }
        }
        return beauty;
    }
}
