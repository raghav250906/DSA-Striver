package b_Arrays;

import java.util.*;

public class Solution_54 {
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j= i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum==0){
                    list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> res = threeSum(arr);
        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
