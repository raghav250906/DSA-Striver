package b_Arrays;
import java.util.*;
public class Solution_57 {
    public static int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preXor = 0;
        int count = 0;
        for(int e:nums){
            preXor^=e;
            int target = preXor^k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(preXor,map.getOrDefault(preXor,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={4,2,2,6,4};
        System.out.println(subarraysWithXorK(arr,6));
    }
}
