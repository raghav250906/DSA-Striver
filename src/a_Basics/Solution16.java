package a_Basics;

import java.util.*;
public class Solution16 {
    static List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        System.out.println(countFrequencies(arr));
    }
}
