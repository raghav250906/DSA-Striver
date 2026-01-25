package b_Arrays;

import java.util.ArrayList;
public class Solution_27 {
    public static boolean isSorted(ArrayList<Integer> arr) {
        boolean sorted = false;
        for(int i=1; i<arr.size()-1;i++){
            if(arr.get(i-1)<arr.get(i) && arr.get(i)<arr.get(i+1)){
                sorted = true;
            }
            else if(arr.get(i-1)>arr.get(i) && arr.get(i)>arr.get(i+1)){
                sorted = true;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(53);
        arr.add(63);
        arr.add(73);
        System.out.println(isSorted(arr));
    }
}
