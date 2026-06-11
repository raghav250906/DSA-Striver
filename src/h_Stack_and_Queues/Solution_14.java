package h_Stack_and_Queues;
import java.util.*;
public class Solution_14 {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        int[] pge = previousGreater(nums);
        int[] nge = nextGreater(nums);

        int[] pse = previousSmaller(nums);
        int[] nse = nextSmaller(nums);

        long maxSum = 0;
        long minSum = 0;

        for(int i = 0; i < n; i++) {

            long leftMax = i - pge[i];
            long rightMax = nge[i] - i;

            long leftMin = i - pse[i];
            long rightMin = nse[i] - i;

            maxSum += (long)nums[i] * leftMax * rightMax;
            minSum += (long)nums[i] * leftMin * rightMin;
        }

        return maxSum - minSum;
    }

    static int[] previousGreater(int[] arr){
        int n = arr.length;
        int[] pge = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            pge[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return pge;
    }

    static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            nge[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return nge;
    }

    static int[] previousSmaller(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            pse[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return pse;
    }

    static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                s.pop();
            }
            nse[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return nse;
    }
}
