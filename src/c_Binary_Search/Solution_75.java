package c_Binary_Search;

public class Solution_75 {
    public static void main(String[] args) {
        System.out.println(floorSqrt(25));
    }
    public static int floorSqrt(int n) {
        int low=0;
        int high=n;
        int ans=1;
        while(low<=high){
            int mid =(low+high)/2;
            int value = mid*mid;
            if(value<=n){
                ans=mid;
                low=mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
}
