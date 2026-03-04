package b_Arrays;

public class Solution_40 {
    public static int majorityElement(int[] arr) {
//        HashMap<Integer,Integer> map= new HashMap<>();
//        int max=0;
//        int ans=0;
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//                if(map.get(arr[i])>max){
//                    max=map.get(arr[i]);
//                    ans=arr[i];
//                }
//            }
//            if(!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//            }
//        }
//        return ans;
        int candidate = arr[0];
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr={7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(arr));
    }
}
