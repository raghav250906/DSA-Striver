/*
Problem: Array ke saare possible subsets (power set)
generate karne hain.

Logic (Bit Manipulation):

1. Agar array me n elements hain,
   to total subsets = 2^n hote hain.

2. Har subset ko ek binary number se represent kar sakte hain.

3. 0 se (2^n - 1) tak iterate karo.

4. Har bit check karo:
   - Bit set (1) => element subset me include karo.
   - Bit unset (0) => element skip karo.

5. Har number ek unique subset represent karega.

Time Complexity: O(N * 2^N)
Space Complexity: O(2^N)
*/

package g_Bit_Manipulation;
import java.util.*;
public class Solution_09 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        int total= 1<<n;
        for(int i=0;i<total;i++){
            List<Integer> curr= new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    curr.add(nums[j]);
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}
