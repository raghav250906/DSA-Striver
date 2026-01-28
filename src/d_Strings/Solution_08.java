package d_Strings;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution_08 {
    /*
     * Question:
     * Ek string di hui hai.
     * Characters ko unki frequency ke according
     * decreasing order me sort karke return karna hai.
     *
     * Example:
     * Input  : "tree"
     * Output : "eert"  (ya "eetr")
     *
     * Logic / Approach:
     * 1. HashMap use karke har character ki frequency count karte hain.
     * 2. Max-Heap (PriorityQueue) banate hain:
     *    - Higher frequency wale characters pehle aayenge.
     * 3. Heap se character nikaal ke
     *    uski frequency ke hisaab se StringBuilder me add kar dete hain.
     *
     * Time Complexity:
     * - Frequency count: O(n)
     * - Heap operations: O(n log n)
     * Overall: O(n log n)
     *
     * Space Complexity: O(n)
     */

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq =
                new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = map.get(ch);
            while(freq-- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
