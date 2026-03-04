package a_Basics;

public class Solution3 {
    public static boolean isPalindrome(int n) {
        if(n<0){
            n=-n;
        }
        int rev=0;
        int a=n;
        while(a!=0){
            int digit = a%10;
            rev = rev*10 + digit;
            a=a/10;
        }
        return (rev == n);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-565));
    }
}
