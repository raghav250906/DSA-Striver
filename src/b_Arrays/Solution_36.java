package b_Arrays;

public class Solution_36 {
    public static int singleNumber(int[] nums) {
//        for(int e:nums){
//            int count=0;
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]==e){
//                    count++;
//                }
//            }
//            if(count==1){
//                return e;
//            }
//        }
//        return 0;
        int n=nums.length;
        int xor=0;
        for(int e:nums){
            xor ^= e;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 2, 4, 3, 1, 4};
        System.out.println(singleNumber(arr));
    }
}
