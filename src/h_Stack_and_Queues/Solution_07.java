package h_Stack_and_Queues;
import java.util.*;
public class Solution_07 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s= new Stack<>();
        int[] arr= new int[10001];
        for(int i=nums2.length-1;i>=0;i--){
            if(s.isEmpty()){
                arr[nums2[i]]=-1;
                s.push(nums2[i]);
            }
            else if(nums2[i]<s.peek()){
                arr[nums2[i]]=s.peek();
                s.push(nums2[i]);
            }
            else{
                while(!s.isEmpty() && s.peek()<nums2[i]){
                    s.pop();
                }
                if(s.isEmpty()) {
                    s.push(nums2[i]);
                    arr[nums2[i]]=-1;
                }
                else{
                    arr[nums2[i]]=s.peek();
                    s.push(nums2[i]);
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=arr[nums1[i]];
        }
        return nums1;

        // USING HASHMAP:
        // HashMap<Integer,Integer> map= new HashMap<>();
        // for(int e:nums1){
        //     map.put(e,-1);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     if(map.containsKey(nums2[i])){
        //         for(int j=i;j<nums2.length;j++){
        //             if(nums2[j]>nums2[i]){
        //                 map.put(nums2[i],nums2[j]);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // for(int i=0;i<nums1.length;i++){
        //     nums1[i]=map.get(nums1[i]);
        // }
        // return nums1;
    }
}
