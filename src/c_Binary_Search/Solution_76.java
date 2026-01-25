package c_Binary_Search;

public class Solution_76 {
    public static void main(String[] args) {
        System.out.println(NthRoot(4,69));
    }
    public static int NthRoot(int N, int M) {
        int low=1;
        int high=N;
        while(low<=high){
            int mid=(low+high)/2;
            double value = Math.pow(mid,N);
            if(value==M) return mid;
            if(value<M) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
