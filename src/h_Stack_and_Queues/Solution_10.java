package h_Stack_and_Queues;

public class Solution_10 {
    public static int[] count_NGE(int arr[], int indices[]) {
        int n= arr.length;
        int q= indices.length;
        for(int i=0;i<q;i++){
            int count=0;
            for(int j=indices[i]+1;j<n;j++){
                if(arr[j]>arr[indices[i]]) count++;
            }
            indices[i]=count;
        }
        return indices;
    }
}
