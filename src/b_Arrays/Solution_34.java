package b_Arrays;

public class Solution_34 {
    public static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int expected = n*(n+1)/2;
//        int actual=0;
//        for(int e:nums){
//            actual=actual+e;
//        }
//        return expected-actual;
        int n= nums.length;
        int xor =0;
        for(int i=0;i<=n;i++){
            xor ^= i;
        }
        for(int e:nums){
            xor ^= e;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr={0, 2, 3, 1, 4};
        System.out.println(missingNumber(arr));
    }
}
