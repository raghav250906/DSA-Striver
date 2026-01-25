package a_Basics;

import java.util.*;
public class Solution17 {
    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq=0;
        int maxElement= nums[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;

    }

    class Solution {
        public static int mostFrequentSmallest(int[] nums) {

            Map<Integer, Integer> map = new HashMap<>();

            // count frequency
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            int maxFreq = 0;
            int result = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getKey();
                int freq = entry.getValue();

                if (freq > maxFreq || (freq == maxFreq && num < result)) {
                    maxFreq = freq;
                    result = num;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,2,3,2,1,1,4,4};
        System.out.println(mostFrequentElement(arr));
        System.out.println(mostFrequentElement(arr));
    }

}