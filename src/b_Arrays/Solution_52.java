package b_Arrays;

import java.util.*;

public class Solution_52 {
    public static int pascalTriangleI(int r, int c) {
        int n= r-1;
        int k=c-1;
        int result=1;
        for(int i=0;i<k;i++){
            result*=(n-i);
            result/=(i+1);
        }
        return result;
    }
    public static List<Integer> getRow(int r){
        List<Integer> row = new ArrayList<Integer>();
        long val=1;
        row.add(1);
        for(int i=1;i<=r;i++){
            val = val*(r-i+1)/i;
            row.add((int)val);
        }
        return row;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            triangle.add(getRow(i));
        }
        return triangle;
    }
    public static void main(String[] args) {
        System.out.println(pascalTriangleI(4,2));
    }
}
