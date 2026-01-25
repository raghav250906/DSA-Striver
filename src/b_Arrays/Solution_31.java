package b_Arrays;

public class Solution_31 {
//    public static void moveZeroes(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<nums.length;i++){
//            if(nums[i]!=0){
//                list.add(nums[i]);
//            }
//        }
//        for(int i=0;i<list.size();i++){
//            nums[i]=list.get(i);
//        }
//        for(int i= list.size();i<nums.length;i++){
//            nums[i]=0;
//        }
//    }

    public static void moveZeroes(int[] arr){
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,4,0,5,2};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
