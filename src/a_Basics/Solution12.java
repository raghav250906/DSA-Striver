package a_Basics;

public class Solution12 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
