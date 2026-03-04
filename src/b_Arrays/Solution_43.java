package b_Arrays;

public class Solution_43 {
    public static int stockBuySell(int[] arr, int n) {
        n=arr.length;
        int minPrice= Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int price:arr){
            minPrice = Math.min(minPrice,price);
            int profit = price-minPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr= {10, 7, 5, 8, 11, 9};
        System.out.println(stockBuySell(arr,6));
    }
}
