package h_Stack_and_Queues;

public class Solution_11 {
    public int trap(int[] height) {
        int n= height.length;
        if(n==0 || n==1) return 0;
        int start=0;
        int water=0;
        int peak=0;
        for(int i=0;i<n;i++){
            if(height[i]>height[peak]){
                peak=i;
            }
        }
        while(start < n-1 && height[start+1]>height[start]){
            start++;
        }
        for(int i=start+1;i<=peak;i++){
            if(height[i]>=height[start]){
                water+= volume(start,i,height);
                start=i;
            }
        }
        start=n-1;
        while(start>0 && height[start-1]>=height[start]){
            start--;
        }
        for(int i=start-1;i>=peak;i--){
            if(height[i]>=height[start]){
                water+= volume(i,start,height);
                start=i;
            }
        }
        return water;
    }
    private static int volume(int srt, int end, int[] arr){
        int toMinus=0;
        for(int i=srt+1;i<end;i++){
            toMinus+= arr[i];
        }
        int h=Math.min(arr[srt],arr[end]);
        int tVolume = (end-srt-1)*h;
        return tVolume - toMinus;
    }
}
