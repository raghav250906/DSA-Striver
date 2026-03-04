package b_Arrays;

public class Solution_60 {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        int missing = -1;
//        int repeating =-1;
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//            if(set.contains(nums[i])){
//                repeating=nums[i];
//            }
//            set.add(nums[i]);
//        }
//        for(int i=1;i<=nums.length;i++){
//            if(!set.contains(i)){
//                missing=i;
//                break;
//            }
//        }
//        return new int[]{repeating, missing};
        int n=nums.length;
        long S = (n*(n+1))/2;
        long S2 = (n*(n+1)*(2*n+1))/6;
        long Sn=0;long S2n=0;
        for(int i=0;i<n;i++){
            Sn+=nums[i];
            S2n+= (long)nums[i] * (long)nums[i];
        }
        long val1=  S - Sn;
        long val2= S2-S2n;
        val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x-val1;
        return new int[] {(int)y,(int)x};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,7};
        int[] arr1= findMissingRepeatingNumbers(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
