package b_Arrays;

import java.util.*;

public class Solution_33 {
    public static int[] unionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                    list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                    list.add(arr1[i]);
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j])
                    list.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                list.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j])
                list.add(arr2[j]);
            j++;
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,5,6};
        int[] arr2={4,5,6,7};
        int[] arr=unionArray(arr1,arr2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
