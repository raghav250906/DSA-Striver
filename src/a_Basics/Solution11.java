package a_Basics;

public class Solution11 {
    public static void main(String[] args) {
        System.out.println(numbersSum(4));
    }
    public static int numbersSum(int n){
        if(n==0){
            return 0;
        }

        return n+numbersSum(n-1);
    }
}
